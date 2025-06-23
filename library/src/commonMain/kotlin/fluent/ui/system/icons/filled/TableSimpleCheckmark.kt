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

public val FluentIcons.Filled.TableSimpleCheckmark: ImageVector
    get() {
        if (_TableSimpleCheckmark != null) {
            return _TableSimpleCheckmark!!
        }
        _TableSimpleCheckmark = ImageVector.Builder(
            name = "Filled.TableSimpleCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.25f, 12.75f)
                verticalLineTo(21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(11.25f)
                close()
                moveTo(12.75f, 21f)
                verticalLineTo(12.75f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 3f)
                verticalLineTo(11.25f)
                horizontalLineTo(21f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(12.75f)
                close()
                moveTo(11.25f, 3f)
                verticalLineTo(11.25f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(11.25f)
                close()
                moveTo(18.783f, 16.28f)
                curveTo(19.076f, 15.987f, 19.076f, 15.513f, 18.783f, 15.22f)
                curveTo(18.49f, 14.927f, 18.015f, 14.927f, 17.723f, 15.22f)
                lineTo(16.25f, 16.692f)
                lineTo(15.78f, 16.223f)
                curveTo(15.487f, 15.93f, 15.013f, 15.93f, 14.72f, 16.223f)
                curveTo(14.427f, 16.515f, 14.427f, 16.99f, 14.72f, 17.283f)
                lineTo(15.72f, 18.283f)
                curveTo(16.013f, 18.576f, 16.487f, 18.576f, 16.78f, 18.283f)
                lineTo(18.783f, 16.28f)
                close()
            }
        }.build()

        return _TableSimpleCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _TableSimpleCheckmark: ImageVector? = null

@Preview
@Composable
private fun TableSimpleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableSimpleCheckmark, contentDescription = null)
    }
}
