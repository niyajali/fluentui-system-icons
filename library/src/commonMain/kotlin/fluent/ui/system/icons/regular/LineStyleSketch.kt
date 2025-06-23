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

public val FluentIcons.Regular.LineStyleSketch: ImageVector
    get() {
        if (_LineStyleSketch != null) {
            return _LineStyleSketch!!
        }
        _LineStyleSketch = ImageVector.Builder(
            name = "Regular.LineStyleSketch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 4f)
                curveTo(2.336f, 4f, 2f, 4.336f, 2f, 4.75f)
                curveTo(2f, 5.164f, 2.336f, 5.5f, 2.75f, 5.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5.5f, 22f, 5.164f, 22f, 4.75f)
                curveTo(22f, 4.336f, 21.664f, 4f, 21.25f, 4f)
                horizontalLineTo(2.75f)
                close()
                moveTo(5.522f, 10.8f)
                curveTo(6.405f, 10.425f, 7.407f, 10f, 8.834f, 10f)
                curveTo(10.262f, 10f, 11.264f, 10.425f, 12.147f, 10.8f)
                lineTo(12.17f, 10.81f)
                curveTo(13.049f, 11.182f, 13.809f, 11.5f, 14.919f, 11.5f)
                curveTo(15.897f, 11.5f, 16.611f, 11.253f, 17.425f, 10.973f)
                curveTo(17.54f, 10.933f, 17.658f, 10.892f, 17.778f, 10.852f)
                curveTo(18.757f, 10.521f, 19.848f, 10.229f, 21.386f, 10.512f)
                curveTo(21.793f, 10.587f, 22.063f, 10.979f, 21.988f, 11.386f)
                curveTo(21.913f, 11.793f, 21.521f, 12.063f, 21.114f, 11.988f)
                curveTo(19.938f, 11.771f, 19.131f, 11.978f, 18.257f, 12.273f)
                curveTo(18.15f, 12.309f, 18.04f, 12.347f, 17.928f, 12.387f)
                curveTo(17.116f, 12.669f, 16.165f, 13f, 14.919f, 13f)
                curveTo(13.491f, 13f, 12.49f, 12.575f, 11.607f, 12.2f)
                lineTo(11.584f, 12.19f)
                curveTo(10.705f, 11.818f, 9.944f, 11.5f, 8.834f, 11.5f)
                curveTo(7.725f, 11.5f, 6.964f, 11.818f, 6.085f, 12.19f)
                lineTo(6.062f, 12.2f)
                curveTo(5.179f, 12.575f, 4.178f, 13f, 2.75f, 13f)
                curveTo(2.336f, 13f, 2f, 12.664f, 2f, 12.25f)
                curveTo(2f, 11.836f, 2.336f, 11.5f, 2.75f, 11.5f)
                curveTo(3.86f, 11.5f, 4.62f, 11.182f, 5.499f, 10.81f)
                lineTo(5.522f, 10.8f)
                close()
                moveTo(21.886f, 17.352f)
                curveTo(21.666f, 17.001f, 21.204f, 16.895f, 20.852f, 17.114f)
                curveTo(20.822f, 17.133f, 20.791f, 17.152f, 20.76f, 17.17f)
                curveTo(20.696f, 17.208f, 20.602f, 17.263f, 20.483f, 17.33f)
                curveTo(20.243f, 17.463f, 19.908f, 17.641f, 19.523f, 17.819f)
                curveTo(18.723f, 18.187f, 17.81f, 18.5f, 17.139f, 18.5f)
                curveTo(16.522f, 18.5f, 16.091f, 18.245f, 15.481f, 17.864f)
                lineTo(15.443f, 17.84f)
                curveTo(14.859f, 17.475f, 14.101f, 17f, 13.028f, 17f)
                curveTo(11.967f, 17f, 11.173f, 17.465f, 10.554f, 17.827f)
                lineTo(10.51f, 17.853f)
                curveTo(9.853f, 18.237f, 9.377f, 18.5f, 8.75f, 18.5f)
                curveTo(8.441f, 18.5f, 8.287f, 18.435f, 8.193f, 18.378f)
                curveTo(8.08f, 18.307f, 7.989f, 18.21f, 7.819f, 18.012f)
                lineTo(7.801f, 17.991f)
                curveTo(7.649f, 17.813f, 7.423f, 17.549f, 7.095f, 17.346f)
                curveTo(6.732f, 17.122f, 6.297f, 17f, 5.75f, 17f)
                curveTo(4.678f, 17f, 3.777f, 17.466f, 3.177f, 17.885f)
                curveTo(2.872f, 18.099f, 2.629f, 18.312f, 2.46f, 18.473f)
                curveTo(2.376f, 18.554f, 2.309f, 18.622f, 2.262f, 18.672f)
                curveTo(2.236f, 18.7f, 2.21f, 18.729f, 2.184f, 18.758f)
                lineTo(2.182f, 18.76f)
                lineTo(2.181f, 18.762f)
                curveTo(1.911f, 19.076f, 1.947f, 19.55f, 2.262f, 19.819f)
                curveTo(2.576f, 20.088f, 3.048f, 20.053f, 3.318f, 19.74f)
                lineTo(3.319f, 19.739f)
                curveTo(3.331f, 19.726f, 3.343f, 19.712f, 3.355f, 19.699f)
                curveTo(3.385f, 19.667f, 3.433f, 19.618f, 3.496f, 19.558f)
                curveTo(3.622f, 19.438f, 3.807f, 19.276f, 4.038f, 19.115f)
                curveTo(4.51f, 18.784f, 5.109f, 18.5f, 5.75f, 18.5f)
                curveTo(6.06f, 18.5f, 6.214f, 18.565f, 6.307f, 18.622f)
                curveTo(6.421f, 18.693f, 6.511f, 18.79f, 6.681f, 18.988f)
                lineTo(6.699f, 19.009f)
                curveTo(6.851f, 19.187f, 7.077f, 19.451f, 7.405f, 19.654f)
                curveTo(7.768f, 19.878f, 8.203f, 20f, 8.75f, 20f)
                curveTo(9.811f, 20f, 10.605f, 19.535f, 11.224f, 19.173f)
                lineTo(11.268f, 19.147f)
                curveTo(11.925f, 18.763f, 12.401f, 18.5f, 13.028f, 18.5f)
                curveTo(13.645f, 18.5f, 14.076f, 18.755f, 14.686f, 19.136f)
                lineTo(14.724f, 19.16f)
                curveTo(15.308f, 19.525f, 16.066f, 20f, 17.139f, 20f)
                curveTo(18.169f, 20f, 19.323f, 19.563f, 20.151f, 19.181f)
                curveTo(20.58f, 18.984f, 20.951f, 18.787f, 21.215f, 18.639f)
                curveTo(21.347f, 18.565f, 21.453f, 18.503f, 21.527f, 18.459f)
                curveTo(21.568f, 18.435f, 21.608f, 18.411f, 21.648f, 18.386f)
                curveTo(21.999f, 18.166f, 22.105f, 17.703f, 21.886f, 17.352f)
                close()
            }
        }.build()

        return _LineStyleSketch!!
    }

@Suppress("ObjectPropertyName")
private var _LineStyleSketch: ImageVector? = null

@Preview
@Composable
private fun LineStyleSketchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineStyleSketch, contentDescription = null)
    }
}
