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

public val FluentIcons.Regular.FolderZip: ImageVector
    get() {
        if (_FolderZip != null) {
            return _FolderZip!!
        }
        _FolderZip = ImageVector.Builder(
            name = "Regular.FolderZip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.5f, 8f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(8.129f)
                curveTo(8.328f, 4.5f, 8.518f, 4.579f, 8.659f, 4.72f)
                lineTo(10.189f, 6.25f)
                lineTo(8.659f, 7.78f)
                curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
                horizontalLineTo(3.5f)
                close()
                moveTo(5.25f, 3f)
                curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 21f, 22f, 19.545f, 22f, 17.75f)
                verticalLineTo(8.75f)
                curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(11.561f)
                lineTo(9.72f, 3.659f)
                curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
                horizontalLineTo(5.25f)
                close()
                moveTo(13.5f, 7f)
                verticalLineTo(10.25f)
                curveTo(13.5f, 10.664f, 13.836f, 11f, 14.25f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 13f, 14f, 13.336f, 14f, 13.75f)
                curveTo(14f, 14.164f, 14.336f, 14.5f, 14.75f, 14.5f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 16f, 14f, 16.336f, 14f, 16.75f)
                curveTo(14f, 17.164f, 14.336f, 17.5f, 14.75f, 17.5f)
                horizontalLineTo(15f)
                verticalLineTo(19.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(8.129f)
                curveTo(8.725f, 9.5f, 9.298f, 9.263f, 9.72f, 8.841f)
                lineTo(11.561f, 7f)
                horizontalLineTo(13.5f)
                close()
                moveTo(16.5f, 19.5f)
                verticalLineTo(16f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 16f, 17.5f, 15.664f, 17.5f, 15.25f)
                curveTo(17.5f, 14.836f, 17.164f, 14.5f, 16.75f, 14.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(11f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 11f, 18f, 10.664f, 18f, 10.25f)
                verticalLineTo(7f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 7f, 20.5f, 7.784f, 20.5f, 8.75f)
                verticalLineTo(17.75f)
                curveTo(20.5f, 18.716f, 19.716f, 19.5f, 18.75f, 19.5f)
                horizontalLineTo(16.5f)
                close()
                moveTo(16.5f, 7f)
                verticalLineTo(9.5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(16.5f)
                close()
            }
        }.build()

        return _FolderZip!!
    }

@Suppress("ObjectPropertyName")
private var _FolderZip: ImageVector? = null

@Preview
@Composable
private fun FolderZipPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderZip, contentDescription = null)
    }
}
