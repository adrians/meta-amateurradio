SUMMARY = "Remote support for Soapy SDR"

DESCRIPTION = "Use any SoapySDR supported device transparently over a local \
network link. The remote support feature can turn any SDR into a network \
peripheral."

HOMEPAGE = "https://github.com/pothosware/SoapyRemote/wiki"

LICENSE = "BSL-1.0 & MIT & Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE_1_0.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

SRCREV = "f920d9bf10f62f67c8e31b7dc25090bc784e5210"
SRC_URI = "git://github.com/pothosware/SoapyRemote.git;protocol=git;branch=master \
          "

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "soapysdr avahi"
RDEPENDS:${PN} = "soapysdr libavahi-client avahi-daemon"

FILES:${PN} += "${libdir}/* ${systemd_unitdir}/system"
