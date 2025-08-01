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

public val FluentIcons.Filled.VideoClipOff: ImageVector
    get() {
        if (_VideoClipOff != null) {
            return _VideoClipOff!!
        }
        _VideoClipOff = ImageVector.Builder(
            name = "Filled.VideoClipOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(2.922f, 3.982f)
                curveTo(2.351f, 4.568f, 2f, 5.368f, 2f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
                horizontalLineTo(18.75f)
                curveTo(19.108f, 21f, 19.452f, 20.942f, 19.774f, 20.835f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(13.116f, 14.177f)
                lineTo(10.482f, 15.626f)
                curveTo(9.815f, 15.993f, 9f, 15.511f, 9f, 14.75f)
                verticalLineTo(10.061f)
                lineTo(13.116f, 14.177f)
                close()
                moveTo(15.481f, 11.124f)
                curveTo(16.045f, 11.434f, 16.149f, 12.151f, 15.793f, 12.611f)
                lineTo(21.864f, 18.683f)
                curveTo(21.953f, 18.387f, 22f, 18.074f, 22f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
                horizontalLineTo(6.182f)
                lineTo(12.87f, 9.688f)
                lineTo(15.481f, 11.124f)
                close()
            }
        }.build()

        return _VideoClipOff!!
    }

@Suppress("ObjectPropertyName")
private var _VideoClipOff: ImageVector? = null

@Preview
@Composable
private fun VideoClipOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoClipOff, contentDescription = null)
    }
}
