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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.FolderMail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderMail",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 8f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
            lineTo(11.25f, 5.189f)
            lineTo(8.659f, 7.78f)
            curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
            horizontalLineTo(2f)
            close()
            moveTo(2f, 9.5f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(11.171f)
            curveTo(11.06f, 20.687f, 11f, 20.351f, 11f, 20f)
            verticalLineTo(15f)
            curveTo(11f, 13.343f, 12.343f, 12f, 14f, 12f)
            horizontalLineTo(21f)
            curveTo(21.351f, 12f, 21.687f, 12.06f, 22f, 12.171f)
            verticalLineTo(8.75f)
            curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(13.061f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(2f)
            close()
            moveTo(12.019f, 14.724f)
            lineTo(17.51f, 17.927f)
            lineTo(23f, 14.971f)
            curveTo(22.984f, 13.88f, 22.095f, 13f, 21f, 13f)
            horizontalLineTo(14f)
            curveTo(12.989f, 13f, 12.153f, 13.75f, 12.019f, 14.724f)
            close()
            moveTo(23f, 16.106f)
            lineTo(17.737f, 18.94f)
            curveTo(17.584f, 19.023f, 17.399f, 19.02f, 17.248f, 18.932f)
            lineTo(12f, 15.87f)
            verticalLineTo(20f)
            curveTo(12f, 21.105f, 12.895f, 22f, 14f, 22f)
            horizontalLineTo(21f)
            curveTo(22.105f, 22f, 23f, 21.105f, 23f, 20f)
            verticalLineTo(16.106f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderMailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderMail, contentDescription = null)
    }
}
