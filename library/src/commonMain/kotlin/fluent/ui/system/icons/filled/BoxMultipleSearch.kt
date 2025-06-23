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

public val FluentIcons.Filled.BoxMultipleSearch: ImageVector
    get() {
        if (_BoxMultipleSearch != null) {
            return _BoxMultipleSearch!!
        }
        _BoxMultipleSearch = ImageVector.Builder(
            name = "Filled.BoxMultipleSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.7f, 2.33f)
                curveTo(14.539f, 2.02f, 15.461f, 2.02f, 16.3f, 2.33f)
                lineTo(20.607f, 3.922f)
                curveTo(21.294f, 4.176f, 21.75f, 4.831f, 21.75f, 5.563f)
                verticalLineTo(14.855f)
                curveTo(21.051f, 12.62f, 18.965f, 10.999f, 16.5f, 10.999f)
                curveTo(16.373f, 10.999f, 16.246f, 11.003f, 16.121f, 11.012f)
                curveTo(15.818f, 10.645f, 15.42f, 10.355f, 14.953f, 10.183f)
                lineTo(10.647f, 8.591f)
                curveTo(9.876f, 8.307f, 9.051f, 8.228f, 8.25f, 8.356f)
                verticalLineTo(5.563f)
                curveTo(8.25f, 4.831f, 8.706f, 4.176f, 9.393f, 3.922f)
                lineTo(13.7f, 2.33f)
                close()
                moveTo(11.305f, 6.254f)
                curveTo(11.17f, 6.646f, 11.378f, 7.073f, 11.769f, 7.208f)
                lineTo(14.428f, 8.127f)
                curveTo(14.799f, 8.255f, 15.202f, 8.255f, 15.573f, 8.127f)
                lineTo(18.223f, 7.208f)
                curveTo(18.614f, 7.073f, 18.822f, 6.645f, 18.686f, 6.254f)
                curveTo(18.55f, 5.863f, 18.123f, 5.655f, 17.732f, 5.791f)
                lineTo(15.081f, 6.709f)
                curveTo(15.028f, 6.728f, 14.971f, 6.728f, 14.918f, 6.709f)
                lineTo(12.259f, 5.79f)
                curveTo(11.868f, 5.655f, 11.441f, 5.863f, 11.305f, 6.254f)
                close()
                moveTo(14.871f, 11.244f)
                curveTo(14.787f, 11.196f, 14.699f, 11.155f, 14.607f, 11.121f)
                lineTo(10.3f, 9.529f)
                curveTo(9.461f, 9.219f, 8.539f, 9.219f, 7.7f, 9.529f)
                lineTo(3.393f, 11.121f)
                curveTo(2.706f, 11.375f, 2.25f, 12.03f, 2.25f, 12.762f)
                verticalLineTo(18.433f)
                curveTo(2.25f, 19.165f, 2.706f, 19.82f, 3.393f, 20.074f)
                lineTo(7.7f, 21.666f)
                curveTo(8.539f, 21.976f, 9.461f, 21.976f, 10.3f, 21.666f)
                lineTo(12.939f, 20.69f)
                curveTo(11.752f, 19.682f, 11f, 18.178f, 11f, 16.499f)
                curveTo(11f, 15.987f, 11.07f, 15.492f, 11.201f, 15.021f)
                lineTo(9.75f, 15.524f)
                verticalLineTo(18.223f)
                curveTo(9.75f, 18.638f, 9.414f, 18.973f, 9f, 18.973f)
                curveTo(8.586f, 18.973f, 8.25f, 18.638f, 8.25f, 18.223f)
                verticalLineTo(15.524f)
                lineTo(5.769f, 14.667f)
                curveTo(5.378f, 14.532f, 5.17f, 14.105f, 5.305f, 13.713f)
                curveTo(5.441f, 13.322f, 5.868f, 13.114f, 6.259f, 13.249f)
                lineTo(9f, 14.197f)
                lineTo(11.732f, 13.25f)
                curveTo(11.85f, 13.209f, 11.971f, 13.199f, 12.087f, 13.216f)
                curveTo(12.774f, 12.293f, 13.745f, 11.593f, 14.871f, 11.244f)
                close()
                moveTo(20.168f, 19.106f)
                curveTo(20.692f, 18.371f, 21f, 17.471f, 21f, 16.499f)
                curveTo(21f, 14.014f, 18.985f, 11.999f, 16.5f, 11.999f)
                curveTo(14.015f, 11.999f, 12f, 14.014f, 12f, 16.499f)
                curveTo(12f, 18.984f, 14.015f, 20.999f, 16.5f, 20.999f)
                curveTo(17.472f, 20.999f, 18.372f, 20.691f, 19.107f, 20.167f)
                lineTo(21.72f, 22.779f)
                curveTo(22.013f, 23.072f, 22.487f, 23.072f, 22.78f, 22.779f)
                curveTo(23.073f, 22.486f, 23.073f, 22.012f, 22.78f, 21.719f)
                lineTo(20.168f, 19.106f)
                close()
                moveTo(19.5f, 16.499f)
                curveTo(19.5f, 18.156f, 18.157f, 19.499f, 16.5f, 19.499f)
                curveTo(14.843f, 19.499f, 13.5f, 18.156f, 13.5f, 16.499f)
                curveTo(13.5f, 14.842f, 14.843f, 13.499f, 16.5f, 13.499f)
                curveTo(18.157f, 13.499f, 19.5f, 14.842f, 19.5f, 16.499f)
                close()
            }
        }.build()

        return _BoxMultipleSearch!!
    }

@Suppress("ObjectPropertyName")
private var _BoxMultipleSearch: ImageVector? = null

@Preview
@Composable
private fun BoxMultipleSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BoxMultipleSearch, contentDescription = null)
    }
}
