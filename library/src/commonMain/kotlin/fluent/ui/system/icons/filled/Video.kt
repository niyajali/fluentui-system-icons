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

public val FluentIcons.Filled.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Filled.Video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 8.25f)
                curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
                horizontalLineTo(11.75f)
                curveTo(13.545f, 5f, 15f, 6.455f, 15f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(15f, 17.545f, 13.545f, 19f, 11.75f, 19f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(19.257f, 17.688f)
                lineTo(16f, 15.439f)
                verticalLineTo(8.562f)
                lineTo(19.257f, 6.313f)
                curveTo(20.418f, 5.511f, 22.002f, 6.342f, 22.002f, 7.753f)
                verticalLineTo(16.248f)
                curveTo(22.002f, 17.659f, 20.418f, 18.49f, 19.257f, 17.688f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null

@Preview
@Composable
private fun VideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Video, contentDescription = null)
    }
}
