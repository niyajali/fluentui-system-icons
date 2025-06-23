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

public val FluentIcons.Filled.TableAltText: ImageVector
    get() {
        if (_TableAltText != null) {
            return _TableAltText!!
        }
        _TableAltText = ImageVector.Builder(
            name = "Filled.TableAltText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 21f)
                horizontalLineTo(11.171f)
                curveTo(11.06f, 20.687f, 11f, 20.351f, 11f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 21f)
                close()
                moveTo(21f, 9.5f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9.5f)
                horizontalLineTo(21f)
                close()
                moveTo(14.5f, 9.5f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                curveTo(12.343f, 11f, 11f, 12.343f, 11f, 14f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                close()
                moveTo(21f, 8f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                close()
                moveTo(14.5f, 3f)
                horizontalLineTo(9.5f)
                verticalLineTo(8f)
                horizontalLineTo(14.5f)
                verticalLineTo(3f)
                close()
                moveTo(8f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                lineTo(8f, 3f)
                close()
                moveTo(3f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                verticalLineTo(9.5f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 16f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(8f)
                lineTo(8f, 16f)
                horizontalLineTo(3f)
                close()
                moveTo(14f, 12f)
                curveTo(12.895f, 12f, 12f, 12.895f, 12f, 14f)
                verticalLineTo(20f)
                curveTo(12f, 21.105f, 12.895f, 22f, 14f, 22f)
                horizontalLineTo(21f)
                curveTo(22.105f, 22f, 23f, 21.105f, 23f, 20f)
                verticalLineTo(14f)
                curveTo(23f, 12.895f, 22.105f, 12f, 21f, 12f)
                horizontalLineTo(14f)
                close()
                moveTo(14f, 15.5f)
                curveTo(14f, 15.224f, 14.224f, 15f, 14.5f, 15f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 15f, 21f, 15.224f, 21f, 15.5f)
                curveTo(21f, 15.776f, 20.776f, 16f, 20.5f, 16f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 16f, 14f, 15.776f, 14f, 15.5f)
                close()
                moveTo(14f, 18.5f)
                curveTo(14f, 18.224f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 18f, 21f, 18.224f, 21f, 18.5f)
                curveTo(21f, 18.776f, 20.776f, 19f, 20.5f, 19f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 19f, 14f, 18.776f, 14f, 18.5f)
                close()
            }
        }.build()

        return _TableAltText!!
    }

@Suppress("ObjectPropertyName")
private var _TableAltText: ImageVector? = null

@Preview
@Composable
private fun TableAltTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableAltText, contentDescription = null)
    }
}
