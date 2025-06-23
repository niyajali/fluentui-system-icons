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

public val FluentIcons.Regular.DataLine: ImageVector
    get() {
        if (_DataLine != null) {
            return _DataLine!!
        }
        _DataLine = ImageVector.Builder(
            name = "Regular.DataLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19f, 4.5f)
                curveTo(18.172f, 4.5f, 17.5f, 5.172f, 17.5f, 6f)
                curveTo(17.5f, 6.828f, 18.172f, 7.5f, 19f, 7.5f)
                curveTo(19.828f, 7.5f, 20.5f, 6.828f, 20.5f, 6f)
                curveTo(20.5f, 5.172f, 19.828f, 4.5f, 19f, 4.5f)
                close()
                moveTo(16f, 6f)
                curveTo(16f, 4.343f, 17.343f, 3f, 19f, 3f)
                curveTo(20.657f, 3f, 22f, 4.343f, 22f, 6f)
                curveTo(22f, 7.657f, 20.657f, 9f, 19f, 9f)
                curveTo(18.838f, 9f, 18.679f, 8.987f, 18.525f, 8.963f)
                lineTo(16.486f, 12.321f)
                curveTo(16.811f, 12.8f, 17f, 13.378f, 17f, 14f)
                curveTo(17f, 15.657f, 15.657f, 17f, 14f, 17f)
                curveTo(13.097f, 17f, 12.287f, 16.601f, 11.737f, 15.97f)
                lineTo(7.996f, 17.841f)
                curveTo(7.999f, 17.893f, 8f, 17.947f, 8f, 18f)
                curveTo(8f, 19.657f, 6.657f, 21f, 5f, 21f)
                curveTo(3.343f, 21f, 2f, 19.657f, 2f, 18f)
                curveTo(2f, 16.343f, 3.343f, 15f, 5f, 15f)
                curveTo(6.066f, 15f, 7.002f, 15.556f, 7.535f, 16.394f)
                lineTo(11.066f, 14.629f)
                curveTo(11.023f, 14.426f, 11f, 14.216f, 11f, 14f)
                curveTo(11f, 12.343f, 12.343f, 11f, 14f, 11f)
                curveTo(14.482f, 11f, 14.938f, 11.114f, 15.342f, 11.316f)
                lineTo(17.139f, 8.354f)
                curveTo(16.445f, 7.804f, 16f, 6.954f, 16f, 6f)
                close()
                moveTo(14f, 12.5f)
                curveTo(13.172f, 12.5f, 12.5f, 13.172f, 12.5f, 14f)
                curveTo(12.5f, 14.828f, 13.172f, 15.5f, 14f, 15.5f)
                curveTo(14.828f, 15.5f, 15.5f, 14.828f, 15.5f, 14f)
                curveTo(15.5f, 13.172f, 14.828f, 12.5f, 14f, 12.5f)
                close()
                moveTo(5f, 16.5f)
                curveTo(4.172f, 16.5f, 3.5f, 17.172f, 3.5f, 18f)
                curveTo(3.5f, 18.828f, 4.172f, 19.5f, 5f, 19.5f)
                curveTo(5.828f, 19.5f, 6.5f, 18.828f, 6.5f, 18f)
                curveTo(6.5f, 17.172f, 5.828f, 16.5f, 5f, 16.5f)
                close()
            }
        }.build()

        return _DataLine!!
    }

@Suppress("ObjectPropertyName")
private var _DataLine: ImageVector? = null

@Preview
@Composable
private fun DataLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataLine, contentDescription = null)
    }
}
