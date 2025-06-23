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

public val FluentIcons.Filled.SendCopy: ImageVector
    get() {
        if (_SendCopy != null) {
            return _SendCopy!!
        }
        _SendCopy = ImageVector.Builder(
            name = "Filled.SendCopy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.004f, 11.5f)
                curveTo(20.517f, 11.5f, 20.94f, 11.886f, 20.998f, 12.383f)
                lineTo(21.004f, 12.5f)
                verticalLineTo(17f)
                curveTo(21.004f, 19.964f, 18.661f, 22.38f, 15.726f, 22.496f)
                lineTo(15.504f, 22.5f)
                lineTo(8.25f, 22.5f)
                curveTo(7.036f, 22.5f, 6.024f, 21.635f, 5.797f, 20.488f)
                lineTo(8.144f, 20.489f)
                lineTo(8.196f, 20.497f)
                lineTo(8.25f, 20.5f)
                lineTo(15.504f, 20.5f)
                curveTo(17.369f, 20.5f, 18.893f, 19.042f, 18.999f, 17.204f)
                lineTo(19.004f, 17.013f)
                lineTo(19.004f, 12.5f)
                curveTo(19.004f, 11.948f, 19.452f, 11.5f, 20.004f, 11.5f)
                close()
                moveTo(16.998f, 9.487f)
                curveTo(17.511f, 9.487f, 17.934f, 9.873f, 17.992f, 10.37f)
                lineTo(17.998f, 10.487f)
                verticalLineTo(16.988f)
                curveTo(17.998f, 18.313f, 16.967f, 19.398f, 15.663f, 19.482f)
                lineTo(15.498f, 19.488f)
                horizontalLineTo(5.498f)
                curveTo(4.173f, 19.488f, 3.088f, 18.456f, 3.003f, 17.152f)
                lineTo(2.998f, 16.988f)
                verticalLineTo(10.498f)
                curveTo(2.998f, 9.946f, 3.446f, 9.498f, 3.998f, 9.498f)
                curveTo(4.511f, 9.498f, 4.934f, 9.884f, 4.991f, 10.382f)
                lineTo(4.998f, 10.498f)
                verticalLineTo(16.988f)
                curveTo(4.998f, 17.233f, 5.175f, 17.437f, 5.408f, 17.48f)
                lineTo(5.498f, 17.488f)
                horizontalLineTo(15.498f)
                curveTo(15.744f, 17.488f, 15.948f, 17.311f, 15.99f, 17.077f)
                lineTo(15.998f, 16.988f)
                verticalLineTo(10.487f)
                curveTo(15.998f, 9.934f, 16.446f, 9.487f, 16.998f, 9.487f)
                close()
                moveTo(6.292f, 5.793f)
                lineTo(9.79f, 2.293f)
                curveTo(10.15f, 1.933f, 10.717f, 1.905f, 11.11f, 2.21f)
                lineTo(11.204f, 2.293f)
                lineTo(14.707f, 5.793f)
                curveTo(15.097f, 6.183f, 15.097f, 6.816f, 14.707f, 7.207f)
                curveTo(14.347f, 7.567f, 13.779f, 7.595f, 13.387f, 7.291f)
                lineTo(13.293f, 7.207f)
                lineTo(11.499f, 5.415f)
                lineTo(11.5f, 14.255f)
                curveTo(11.5f, 14.768f, 11.114f, 15.191f, 10.616f, 15.248f)
                lineTo(10.5f, 15.255f)
                curveTo(9.987f, 15.255f, 9.564f, 14.869f, 9.506f, 14.372f)
                lineTo(9.5f, 14.255f)
                lineTo(9.499f, 5.412f)
                lineTo(7.707f, 7.207f)
                curveTo(7.347f, 7.567f, 6.779f, 7.595f, 6.387f, 7.291f)
                lineTo(6.293f, 7.207f)
                curveTo(5.932f, 6.847f, 5.904f, 6.28f, 6.209f, 5.887f)
                lineTo(6.292f, 5.793f)
                lineTo(9.79f, 2.293f)
                lineTo(6.292f, 5.793f)
                close()
            }
        }.build()

        return _SendCopy!!
    }

@Suppress("ObjectPropertyName")
private var _SendCopy: ImageVector? = null

@Preview
@Composable
private fun SendCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SendCopy, contentDescription = null)
    }
}
