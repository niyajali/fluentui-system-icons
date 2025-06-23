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

public val FluentIcons.Filled.TableSimpleExclude: ImageVector
    get() {
        if (_TableSimpleExclude != null) {
            return _TableSimpleExclude!!
        }
        _TableSimpleExclude = ImageVector.Builder(
            name = "Filled.TableSimpleExclude",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 2f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(2f)
                verticalLineTo(5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                close()
                moveTo(2f, 11f)
                verticalLineTo(15.25f)
                curveTo(2f, 17.045f, 3.455f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                close()
                moveTo(18.5f, 9.5f)
                verticalLineTo(5.25f)
                curveTo(18.5f, 3.455f, 17.045f, 2f, 15.25f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(9.5f)
                horizontalLineTo(18.5f)
                close()
                moveTo(12.5f, 14.75f)
                curveTo(12.5f, 13.507f, 13.507f, 12.5f, 14.75f, 12.5f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 12.5f, 22f, 13.507f, 22f, 14.75f)
                verticalLineTo(19.75f)
                curveTo(22f, 20.993f, 20.993f, 22f, 19.75f, 22f)
                horizontalLineTo(14.75f)
                curveTo(13.507f, 22f, 12.5f, 20.993f, 12.5f, 19.75f)
                verticalLineTo(14.75f)
                close()
            }
        }.build()

        return _TableSimpleExclude!!
    }

@Suppress("ObjectPropertyName")
private var _TableSimpleExclude: ImageVector? = null

@Preview
@Composable
private fun TableSimpleExcludePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableSimpleExclude, contentDescription = null)
    }
}
