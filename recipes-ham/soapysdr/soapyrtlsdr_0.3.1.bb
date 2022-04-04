SUMMARY = "Soapy SDR plugin for RTL-SDR"

DESCRIPTION = "The Soapy RTL-SDR project provides a plugin module to use the \
RTL-SDR dongle within the SoapySDR API and software that supports SoapySDR."

HOMEPAGE = "https://github.com/pothosware/SoapyRTLSDR/wiki"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=76c8dd204c0791e9a30c30d0406b75da"

SRCREV = "bec4f0504b29369fd8ff651e6954b960991bc1b1"
SRC_URI = "git://github.com/pothosware/SoapyRTLSDR.git;protocol=https;branch=master \
          "

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "rtlsdr soapysdr"
RDEPENDS:${PN} = "rtlsdr soapysdr"
FILES:${PN} += "${libdir}/*"
