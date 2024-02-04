SUMMARY = "Hello from Noral"
LICENSE = "CLOSED"
SRC_URI = "file://main.c"
# S = "${WORKDIR}"
do_compile(){
    bbwarn "the compiler is ${CC}"
    bbwarn "the ldflags is ${LDFLAGS}" 
    ${CC} ${LDFLAGS} ${WORKDIR}/main.c -o ${WORKDIR}/hello_c -DCONFIG_VALUE=15
}

do_install(){
    # mkdir -p ~/embeddedLinux/repo2/poky/build-qemu/tmp/work/core2-64-poky-linux/helloc/1.0-r0/image/usr/bin
    install -d ${D}/usr/bin
    cp ${WORKDIR}/hello_c ${D}/usr/bin
}