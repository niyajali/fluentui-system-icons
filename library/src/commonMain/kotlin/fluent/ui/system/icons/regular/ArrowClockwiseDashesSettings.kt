/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowClockwiseDashesSettings: ImageVector
    get() {
        if (_ArrowClockwiseDashesSettings != null) {
            return _ArrowClockwiseDashesSettings!!
        }
        _ArrowClockwiseDashesSettings = ImageVector.Builder(
            name = "Regular.ArrowClockwiseDashesSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.163f, 3.187f)
                curveTo(10.606f, 3.096f, 10.999f, 3.45f, 10.999f, 3.902f)
                curveTo(10.999f, 4.282f, 10.717f, 4.599f, 10.346f, 4.683f)
                curveTo(9.499f, 4.873f, 8.707f, 5.207f, 7.995f, 5.657f)
                curveTo(7.674f, 5.86f, 7.25f, 5.836f, 6.981f, 5.567f)
                curveTo(6.662f, 5.247f, 6.69f, 4.718f, 7.068f, 4.47f)
                curveTo(7.995f, 3.862f, 9.041f, 3.42f, 10.163f, 3.187f)
                close()
                moveTo(12.999f, 3.902f)
                curveTo(12.999f, 4.282f, 13.282f, 4.599f, 13.653f, 4.683f)
                curveTo(14.965f, 4.978f, 16.146f, 5.617f, 17.098f, 6.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 6.5f, 15f, 6.836f, 15f, 7.25f)
                curveTo(15f, 7.664f, 15.336f, 8f, 15.75f, 8f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 8f, 19.5f, 7.664f, 19.5f, 7.25f)
                verticalLineTo(4.25f)
                curveTo(19.5f, 3.836f, 19.164f, 3.5f, 18.75f, 3.5f)
                curveTo(18.336f, 3.5f, 18f, 3.836f, 18f, 4.25f)
                verticalLineTo(5.292f)
                curveTo(16.842f, 4.256f, 15.415f, 3.515f, 13.836f, 3.187f)
                curveTo(13.393f, 3.096f, 12.999f, 3.45f, 12.999f, 3.902f)
                close()
                moveTo(7.994f, 18.342f)
                curveTo(7.672f, 18.139f, 7.248f, 18.163f, 6.98f, 18.432f)
                curveTo(6.66f, 18.751f, 6.688f, 19.281f, 7.066f, 19.529f)
                curveTo(7.993f, 20.137f, 9.04f, 20.58f, 10.163f, 20.813f)
                curveTo(10.606f, 20.904f, 10.999f, 20.55f, 10.999f, 20.098f)
                curveTo(10.999f, 19.718f, 10.717f, 19.4f, 10.346f, 19.317f)
                curveTo(9.498f, 19.126f, 8.705f, 18.792f, 7.994f, 18.342f)
                close()
                moveTo(4.682f, 13.652f)
                curveTo(4.598f, 13.281f, 4.281f, 12.998f, 3.901f, 12.998f)
                curveTo(3.449f, 12.998f, 3.095f, 13.392f, 3.186f, 13.835f)
                curveTo(3.419f, 14.957f, 3.861f, 16.004f, 4.469f, 16.931f)
                curveTo(4.717f, 17.309f, 5.246f, 17.337f, 5.566f, 17.017f)
                curveTo(5.834f, 16.749f, 5.859f, 16.325f, 5.656f, 16.003f)
                curveTo(5.206f, 15.292f, 4.872f, 14.499f, 4.682f, 13.652f)
                close()
                moveTo(5.657f, 7.995f)
                curveTo(5.86f, 7.674f, 5.836f, 7.25f, 5.567f, 6.981f)
                curveTo(5.247f, 6.661f, 4.718f, 6.689f, 4.47f, 7.067f)
                curveTo(3.862f, 7.994f, 3.42f, 9.04f, 3.187f, 10.162f)
                curveTo(3.095f, 10.605f, 3.45f, 10.998f, 3.901f, 10.998f)
                curveTo(4.282f, 10.998f, 4.599f, 10.716f, 4.682f, 10.345f)
                curveTo(4.873f, 9.498f, 5.207f, 8.706f, 5.657f, 7.995f)
                close()
                moveTo(14.277f, 13.976f)
                curveTo(14.592f, 15.066f, 13.938f, 16.199f, 12.836f, 16.472f)
                lineTo(12.252f, 16.617f)
                curveTo(12.207f, 16.904f, 12.184f, 17.199f, 12.184f, 17.5f)
                curveTo(12.184f, 17.815f, 12.209f, 18.124f, 12.258f, 18.424f)
                lineTo(12.798f, 18.554f)
                curveTo(13.91f, 18.822f, 14.571f, 19.967f, 14.248f, 21.064f)
                lineTo(14.061f, 21.695f)
                curveTo(14.5f, 22.081f, 15.001f, 22.394f, 15.545f, 22.617f)
                lineTo(16.039f, 22.098f)
                curveTo(16.827f, 21.269f, 18.15f, 21.269f, 18.938f, 22.099f)
                lineTo(19.437f, 22.624f)
                curveTo(19.98f, 22.403f, 20.48f, 22.093f, 20.919f, 21.711f)
                lineTo(20.721f, 21.025f)
                curveTo(20.407f, 19.934f, 21.061f, 18.801f, 22.163f, 18.528f)
                lineTo(22.746f, 18.384f)
                curveTo(22.791f, 18.096f, 22.815f, 17.801f, 22.815f, 17.5f)
                curveTo(22.815f, 17.186f, 22.789f, 16.877f, 22.74f, 16.577f)
                lineTo(22.201f, 16.447f)
                curveTo(21.088f, 16.179f, 20.427f, 15.034f, 20.751f, 13.936f)
                lineTo(20.937f, 13.306f)
                curveTo(20.498f, 12.92f, 19.997f, 12.607f, 19.453f, 12.384f)
                lineTo(18.96f, 12.902f)
                curveTo(18.171f, 13.732f, 16.849f, 13.731f, 16.061f, 12.902f)
                lineTo(15.562f, 12.377f)
                curveTo(15.018f, 12.597f, 14.518f, 12.907f, 14.079f, 13.29f)
                lineTo(14.277f, 13.976f)
                close()
                moveTo(17.499f, 19f)
                curveTo(16.698f, 19f, 16.049f, 18.329f, 16.049f, 17.5f)
                curveTo(16.049f, 16.672f, 16.698f, 16f, 17.499f, 16f)
                curveTo(18.3f, 16f, 18.949f, 16.672f, 18.949f, 17.5f)
                curveTo(18.949f, 18.329f, 18.3f, 19f, 17.499f, 19f)
                close()
            }
        }.build()

        return _ArrowClockwiseDashesSettings!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwiseDashesSettings: ImageVector? = null

@Preview
@Composable
private fun ArrowClockwiseDashesSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowClockwiseDashesSettings, contentDescription = null)
    }
}
