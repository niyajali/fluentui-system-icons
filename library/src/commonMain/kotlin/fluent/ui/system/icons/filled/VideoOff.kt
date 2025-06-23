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

public val FluentIcons.Filled.VideoOff: ImageVector
    get() {
        if (_VideoOff != null) {
            return _VideoOff!!
        }
        _VideoOff = ImageVector.Builder(
            name = "Filled.VideoOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(4.135f, 5.196f)
                curveTo(2.889f, 5.651f, 2f, 6.847f, 2f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
                horizontalLineTo(11.75f)
                curveTo(13.445f, 19f, 14.836f, 17.703f, 14.987f, 16.048f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(16f, 12.818f)
                lineTo(21.008f, 17.826f)
                curveTo(21.578f, 17.552f, 22.002f, 16.978f, 22.002f, 16.248f)
                verticalLineTo(7.753f)
                curveTo(22.002f, 6.342f, 20.418f, 5.511f, 19.257f, 6.313f)
                lineTo(16f, 8.562f)
                verticalLineTo(12.818f)
                close()
                moveTo(8.182f, 5f)
                lineTo(15f, 11.818f)
                verticalLineTo(8.25f)
                curveTo(15f, 6.455f, 13.545f, 5f, 11.75f, 5f)
                horizontalLineTo(8.182f)
                close()
            }
        }.build()

        return _VideoOff!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOff: ImageVector? = null

@Preview
@Composable
private fun VideoOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoOff, contentDescription = null)
    }
}
