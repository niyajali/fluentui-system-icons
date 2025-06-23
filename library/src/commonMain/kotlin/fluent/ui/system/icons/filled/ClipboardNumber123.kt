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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.ClipboardNumber123: ImageVector
    get() {
        if (_ClipboardNumber123 != null) {
            return _ClipboardNumber123!!
        }
        _ClipboardNumber123 = ImageVector.Builder(
            name = "Filled.ClipboardNumber123",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 4f)
                horizontalLineTo(15.986f)
                curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 4f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(8.669f)
                curveTo(8.561f, 21.773f, 8.5f, 21.518f, 8.5f, 21.25f)
                verticalLineTo(18.982f)
                curveTo(7.819f, 19.08f, 7.116f, 18.769f, 6.744f, 18.141f)
                curveTo(6.252f, 17.309f, 6.527f, 16.236f, 7.359f, 15.743f)
                curveTo(7.708f, 15.537f, 8.053f, 15.167f, 8.335f, 14.775f)
                curveTo(8.96f, 13.904f, 9.951f, 13.861f, 10.529f, 14.024f)
                curveTo(10.943f, 14.141f, 11.514f, 14.476f, 11.808f, 15.077f)
                curveTo(12.543f, 14.42f, 13.402f, 14.05f, 14.3f, 14.004f)
                curveTo(15.312f, 13.953f, 16.237f, 14.325f, 16.901f, 14.924f)
                curveTo(17.081f, 15.087f, 17.251f, 15.275f, 17.4f, 15.483f)
                curveTo(17.427f, 15.451f, 17.455f, 15.419f, 17.485f, 15.387f)
                curveTo(18.246f, 14.591f, 19.131f, 14.163f, 20f, 14.039f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                close()
                moveTo(10.25f, 5f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(11f, 15.938f)
                curveTo(11f, 15.376f, 10.567f, 15.074f, 10.258f, 14.987f)
                curveTo(9.949f, 14.9f, 9.454f, 14.931f, 9.147f, 15.358f)
                curveTo(8.83f, 15.801f, 8.388f, 16.297f, 7.868f, 16.604f)
                curveTo(7.512f, 16.815f, 7.394f, 17.275f, 7.605f, 17.632f)
                curveTo(7.815f, 17.988f, 8.275f, 18.106f, 8.632f, 17.896f)
                curveTo(8.955f, 17.704f, 9.245f, 17.474f, 9.5f, 17.233f)
                verticalLineTo(21.25f)
                curveTo(9.5f, 21.664f, 9.836f, 22f, 10.25f, 22f)
                curveTo(10.664f, 22f, 11f, 21.664f, 11f, 21.25f)
                verticalLineTo(15.938f)
                close()
                moveTo(14.425f, 16.501f)
                curveTo(14.119f, 16.517f, 13.721f, 16.66f, 13.301f, 17.112f)
                curveTo(13.019f, 17.416f, 12.545f, 17.434f, 12.241f, 17.152f)
                curveTo(11.937f, 16.87f, 11.92f, 16.396f, 12.201f, 16.092f)
                curveTo(12.851f, 15.392f, 13.604f, 15.041f, 14.35f, 15.003f)
                curveTo(15.085f, 14.966f, 15.753f, 15.237f, 16.232f, 15.668f)
                curveTo(16.704f, 16.093f, 17.035f, 16.722f, 16.986f, 17.416f)
                curveTo(16.936f, 18.142f, 16.484f, 18.766f, 15.733f, 19.174f)
                curveTo(14.783f, 19.69f, 14.237f, 20.15f, 13.925f, 20.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 20.5f, 17f, 20.836f, 17f, 21.25f)
                curveTo(17f, 21.664f, 16.664f, 22f, 16.25f, 22f)
                horizontalLineTo(12.751f)
                curveTo(12.369f, 22f, 12.048f, 21.713f, 12.006f, 21.334f)
                curveTo(12.006f, 21.334f, 12.006f, 21.334f, 12.006f, 21.332f)
                lineTo(12.005f, 21.33f)
                lineTo(12.005f, 21.326f)
                lineTo(12.004f, 21.319f)
                lineTo(12.003f, 21.302f)
                curveTo(12.002f, 21.29f, 12.001f, 21.277f, 12.001f, 21.263f)
                curveTo(12f, 21.234f, 12f, 21.2f, 12.001f, 21.161f)
                curveTo(12.005f, 21.083f, 12.015f, 20.987f, 12.04f, 20.875f)
                curveTo(12.089f, 20.648f, 12.191f, 20.367f, 12.392f, 20.047f)
                curveTo(12.79f, 19.41f, 13.56f, 18.647f, 15.017f, 17.856f)
                curveTo(15.418f, 17.638f, 15.482f, 17.422f, 15.49f, 17.312f)
                curveTo(15.5f, 17.17f, 15.432f, 16.966f, 15.227f, 16.782f)
                curveTo(15.029f, 16.603f, 14.743f, 16.485f, 14.425f, 16.501f)
                close()
                moveTo(19.292f, 17.115f)
                curveTo(20.17f, 16.197f, 21.052f, 16.487f, 21.368f, 16.833f)
                curveTo(21.528f, 17.009f, 21.509f, 17.127f, 21.479f, 17.19f)
                curveTo(21.429f, 17.293f, 21.193f, 17.583f, 20.343f, 17.766f)
                curveTo(19.997f, 17.84f, 19.75f, 18.145f, 19.75f, 18.499f)
                curveTo(19.75f, 18.852f, 19.997f, 19.158f, 20.342f, 19.232f)
                curveTo(21.192f, 19.415f, 21.429f, 19.705f, 21.478f, 19.809f)
                curveTo(21.509f, 19.872f, 21.528f, 19.992f, 21.368f, 20.167f)
                curveTo(21.052f, 20.513f, 20.171f, 20.803f, 19.293f, 19.883f)
                curveTo(19.007f, 19.583f, 18.532f, 19.572f, 18.232f, 19.858f)
                curveTo(17.933f, 20.144f, 17.921f, 20.619f, 18.207f, 20.919f)
                curveTo(19.663f, 22.444f, 21.552f, 22.191f, 22.476f, 21.178f)
                curveTo(22.935f, 20.674f, 23.192f, 19.911f, 22.83f, 19.159f)
                curveTo(22.709f, 18.908f, 22.533f, 18.688f, 22.31f, 18.499f)
                curveTo(22.533f, 18.311f, 22.709f, 18.092f, 22.83f, 17.84f)
                curveTo(23.192f, 17.089f, 22.935f, 16.325f, 22.476f, 15.822f)
                curveTo(21.552f, 14.81f, 19.663f, 14.556f, 18.208f, 16.079f)
                curveTo(17.922f, 16.378f, 17.932f, 16.853f, 18.232f, 17.139f)
                curveTo(18.531f, 17.425f, 19.006f, 17.415f, 19.292f, 17.115f)
                close()
            }
        }.build()

        return _ClipboardNumber123!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardNumber123: ImageVector? = null

@Preview
@Composable
private fun ClipboardNumber123Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardNumber123, contentDescription = null)
    }
}
