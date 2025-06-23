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

public val FluentIcons.Filled.PersonBoard: ImageVector
    get() {
        if (_PersonBoard != null) {
            return _PersonBoard!!
        }
        _PersonBoard = ImageVector.Builder(
            name = "Filled.PersonBoard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3f, 16.545f, 4.455f, 18f, 6.25f, 18f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 18f, 18f, 16.545f, 18f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(18f, 4.455f, 16.545f, 3f, 14.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12.75f, 7.5f)
                curveTo(12.75f, 8.743f, 11.743f, 9.75f, 10.5f, 9.75f)
                curveTo(9.257f, 9.75f, 8.25f, 8.743f, 8.25f, 7.5f)
                curveTo(8.25f, 6.257f, 9.257f, 5.25f, 10.5f, 5.25f)
                curveTo(11.743f, 5.25f, 12.75f, 6.257f, 12.75f, 7.5f)
                close()
                moveTo(13.5f, 10.75f)
                curveTo(14.328f, 10.75f, 15f, 11.422f, 15f, 12.25f)
                verticalLineTo(12.75f)
                curveTo(15f, 13.246f, 14.914f, 13.61f, 14.746f, 13.911f)
                curveTo(14.578f, 14.213f, 14.316f, 14.472f, 13.928f, 14.739f)
                curveTo(13.195f, 15.243f, 12.07f, 15.5f, 10.5f, 15.5f)
                curveTo(9.18f, 15.5f, 8.055f, 15.243f, 7.26f, 14.739f)
                curveTo(6.841f, 14.474f, 6.53f, 14.216f, 6.322f, 13.91f)
                curveTo(6.117f, 13.609f, 6f, 13.246f, 6f, 12.75f)
                verticalLineTo(12.25f)
                curveTo(6f, 11.422f, 6.672f, 10.75f, 7.5f, 10.75f)
                horizontalLineTo(13.5f)
                close()
                moveTo(6.011f, 19f)
                curveTo(6.588f, 19.902f, 7.599f, 20.5f, 8.75f, 20.5f)
                horizontalLineTo(15.25f)
                curveTo(18.149f, 20.5f, 20.5f, 18.149f, 20.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(20.5f, 7.599f, 19.902f, 6.588f, 19f, 6.011f)
                verticalLineTo(15.25f)
                curveTo(19f, 17.321f, 17.321f, 19f, 15.25f, 19f)
                horizontalLineTo(6.011f)
                close()
            }
        }.build()

        return _PersonBoard!!
    }

@Suppress("ObjectPropertyName")
private var _PersonBoard: ImageVector? = null

@Preview
@Composable
private fun PersonBoardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonBoard, contentDescription = null)
    }
}
