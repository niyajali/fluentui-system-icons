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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.FolderProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FolderProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
            lineTo(10.189f, 6.25f)
            lineTo(8.659f, 4.72f)
            curveTo(8.518f, 4.579f, 8.328f, 4.5f, 8.129f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            close()
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
            lineTo(11.561f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
            verticalLineTo(12.81f)
            curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
            verticalLineTo(8.75f)
            curveTo(20.5f, 7.784f, 19.716f, 7f, 18.75f, 7f)
            horizontalLineTo(11.561f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(11.314f)
            curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(13.5f, 17.5f)
            curveTo(13.5f, 18.333f, 13.755f, 19.108f, 14.191f, 19.748f)
            lineTo(19.748f, 14.191f)
            curveTo(19.108f, 13.755f, 18.333f, 13.5f, 17.5f, 13.5f)
            curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
            close()
            moveTo(17.5f, 21.5f)
            curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
            curveTo(21.5f, 16.667f, 21.245f, 15.892f, 20.809f, 15.252f)
            lineTo(15.252f, 20.809f)
            curveTo(15.892f, 21.245f, 16.667f, 21.5f, 17.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderProhibited, contentDescription = null)
    }
}
