SUMMARY = "Hello from cpp"
LICENSE = "CLOSED"
SRC_URI = "file://helloccp.cpp"
S = "${WORKDIR}"
do_compile(){
    bbwarn "the compiler is ${CC}"
    bbwarn "the ldflags is ${LDFLAGS}" 
    bbwarn "the CXXFLAGS is ${LDFLAGS}" 
    ${CXX} ${LDFLAGS} ${CXXFLAGS} helloccp.cpp -o hello_cpp
}

do_install(){
    # mkdir -p ~/embeddedLinux/repo2/poky/build-qemu/tmp/work/core2-64-poky-linux/helloc/1.0-r0/image/usr/bin
    install -d ${D}/usr/bin
    cp ${WORKDIR}/hello_cpp ${D}/usr/bin
}