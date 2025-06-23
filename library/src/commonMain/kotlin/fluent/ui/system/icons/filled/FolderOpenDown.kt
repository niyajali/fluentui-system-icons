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

public val FluentIcons.Filled.FolderOpenDown: ImageVector
    get() {
        if (_FolderOpenDown != null) {
            return _FolderOpenDown!!
        }
        _FolderOpenDown = ImageVector.Builder(
            name = "Filled.FolderOpenDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 21.004f)
                curveTo(3.455f, 21.004f, 2f, 19.549f, 2f, 17.754f)
                verticalLineTo(8.843f)
                lineTo(4.045f, 12.384f)
                curveTo(4.804f, 13.699f, 6.207f, 14.509f, 7.725f, 14.509f)
                lineTo(20f, 14.509f)
                verticalLineTo(15.254f)
                curveTo(20f, 17.049f, 18.545f, 18.504f, 16.75f, 18.504f)
                horizontalLineTo(11.561f)
                lineTo(9.72f, 20.345f)
                curveTo(9.298f, 20.767f, 8.725f, 21.004f, 8.129f, 21.004f)
                horizontalLineTo(5.25f)
                close()
                moveTo(7.725f, 13.009f)
                lineTo(20.744f, 13.009f)
                curveTo(22.476f, 13.009f, 23.559f, 11.134f, 22.693f, 9.634f)
                lineTo(19.657f, 4.375f)
                curveTo(19.166f, 3.524f, 18.258f, 3f, 17.275f, 3f)
                horizontalLineTo(4.256f)
                curveTo(2.524f, 3f, 1.441f, 4.875f, 2.307f, 6.375f)
                lineTo(5.344f, 11.634f)
                curveTo(5.835f, 12.485f, 6.743f, 13.009f, 7.725f, 13.009f)
                close()
            }
        }.build()

        return _FolderOpenDown!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpenDown: ImageVector? = null

@Preview
@Composable
private fun FolderOpenDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderOpenDown, contentDescription = null)
    }
}
