include recipes-core/images/core-image-minimal.bb
IMAGE_FEATURES += " ssh-server-dropbear"
IMAGE_INSTALL += " helloc hellocpp strace wpa-supplicant net-tools"
IMAGE_INSTALL += " control-gpio"



do_install:append() {
    install -m 0644 ${WORKDIR}/wpa_supplicant.conf ${D}/${WPA_SUPPLICANT_CONF}
    oe_runmake install
}
