SUMMARY = "Soapy SDR plugin for RTL-SDR"

DESCRIPTION = "The Soapy RTL-SDR project provides a plugin module to use the \
RTL-SDR dongle within the SoapySDR API and software that supports SoapySDR."

HOMEPAGE = "https://github.com/pothosware/SoapyRTLSDR/wiki"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=76c8dd204c0791e9a30c30d0406b75da"

SRCREV = "5c5d9503337c6d1c34b496dec6f908aab9478b0f"
SRC_URI = "git://github.com/pothosware/SoapyRTLSDR.git;protocol=git;branch=master \
          "

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "rtlsdr soapysdr"
RDEPENDS:${PN} = "rtlsdr soapysdr"
FILES:${PN} += "${libdir}/*"
