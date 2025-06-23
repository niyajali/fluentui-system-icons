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

public val FluentIcons.Filled.BoxMultiple: ImageVector
    get() {
        if (_BoxMultiple != null) {
            return _BoxMultiple!!
        }
        _BoxMultiple = ImageVector.Builder(
            name = "Filled.BoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.3f, 2.33f)
                curveTo(15.461f, 2.02f, 14.539f, 2.02f, 13.7f, 2.33f)
                lineTo(9.393f, 3.922f)
                curveTo(8.706f, 4.176f, 8.25f, 4.831f, 8.25f, 5.563f)
                verticalLineTo(8.356f)
                curveTo(9.051f, 8.228f, 9.876f, 8.307f, 10.647f, 8.591f)
                lineTo(14.953f, 10.183f)
                curveTo(16.033f, 10.582f, 16.75f, 11.611f, 16.75f, 12.762f)
                verticalLineTo(18.433f)
                curveTo(16.75f, 18.755f, 16.694f, 19.067f, 16.589f, 19.359f)
                lineTo(20.607f, 17.875f)
                curveTo(21.294f, 17.621f, 21.75f, 16.966f, 21.75f, 16.233f)
                verticalLineTo(5.563f)
                curveTo(21.75f, 4.831f, 21.294f, 4.176f, 20.607f, 3.922f)
                lineTo(16.3f, 2.33f)
                close()
                moveTo(11.769f, 7.208f)
                curveTo(11.378f, 7.073f, 11.17f, 6.646f, 11.305f, 6.254f)
                curveTo(11.441f, 5.863f, 11.868f, 5.655f, 12.259f, 5.79f)
                lineTo(14.918f, 6.709f)
                curveTo(14.971f, 6.728f, 15.028f, 6.728f, 15.081f, 6.709f)
                lineTo(17.732f, 5.791f)
                curveTo(18.123f, 5.655f, 18.55f, 5.863f, 18.686f, 6.254f)
                curveTo(18.822f, 6.645f, 18.614f, 7.073f, 18.223f, 7.208f)
                lineTo(15.573f, 8.127f)
                curveTo(15.202f, 8.255f, 14.799f, 8.255f, 14.428f, 8.127f)
                lineTo(11.769f, 7.208f)
                close()
                moveTo(7.7f, 9.529f)
                curveTo(8.539f, 9.219f, 9.461f, 9.219f, 10.3f, 9.529f)
                lineTo(14.607f, 11.121f)
                curveTo(15.294f, 11.375f, 15.75f, 12.03f, 15.75f, 12.762f)
                verticalLineTo(18.433f)
                curveTo(15.75f, 19.165f, 15.294f, 19.82f, 14.607f, 20.074f)
                lineTo(10.3f, 21.666f)
                curveTo(9.461f, 21.976f, 8.539f, 21.976f, 7.7f, 21.666f)
                lineTo(3.393f, 20.074f)
                curveTo(2.706f, 19.82f, 2.25f, 19.165f, 2.25f, 18.433f)
                verticalLineTo(12.762f)
                curveTo(2.25f, 12.03f, 2.706f, 11.375f, 3.393f, 11.121f)
                lineTo(7.7f, 9.529f)
                close()
                moveTo(5.305f, 13.713f)
                curveTo(5.17f, 14.105f, 5.378f, 14.532f, 5.769f, 14.667f)
                lineTo(8.25f, 15.524f)
                verticalLineTo(18.223f)
                curveTo(8.25f, 18.638f, 8.586f, 18.973f, 9f, 18.973f)
                curveTo(9.414f, 18.973f, 9.75f, 18.638f, 9.75f, 18.223f)
                verticalLineTo(15.524f)
                lineTo(12.223f, 14.667f)
                curveTo(12.614f, 14.532f, 12.822f, 14.104f, 12.686f, 13.713f)
                curveTo(12.55f, 13.322f, 12.123f, 13.114f, 11.732f, 13.25f)
                lineTo(9f, 14.197f)
                lineTo(6.259f, 13.249f)
                curveTo(5.868f, 13.114f, 5.441f, 13.322f, 5.305f, 13.713f)
                close()
            }
        }.build()

        return _BoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _BoxMultiple: ImageVector? = null

@Preview
@Composable
private fun BoxMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BoxMultiple, contentDescription = null)
    }
}
