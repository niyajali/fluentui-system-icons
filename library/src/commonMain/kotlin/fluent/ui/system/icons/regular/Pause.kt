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

public val FluentIcons.Regular.Pause: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pause",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(5.007f, 3f, 4f, 4.007f, 4f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(4f, 19.993f, 5.007f, 21f, 6.25f, 21f)
            horizontalLineTo(8.75f)
            curveTo(9.993f, 21f, 11f, 19.993f, 11f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(11f, 4.007f, 9.993f, 3f, 8.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(5.5f, 5.25f)
            curveTo(5.5f, 4.836f, 5.836f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 4.5f, 9.5f, 4.836f, 9.5f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(9.5f, 19.164f, 9.164f, 19.5f, 8.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 19.5f, 5.5f, 19.164f, 5.5f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(15.25f, 3f)
            curveTo(14.007f, 3f, 13f, 4.007f, 13f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(13f, 19.993f, 14.007f, 21f, 15.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 21f, 20f, 19.993f, 20f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(20f, 4.007f, 18.993f, 3f, 17.75f, 3f)
            horizontalLineTo(15.25f)
            close()
            moveTo(14.5f, 5.25f)
            curveTo(14.5f, 4.836f, 14.836f, 4.5f, 15.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 4.5f, 18.5f, 4.836f, 18.5f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(18.5f, 19.164f, 18.164f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 19.5f, 14.5f, 19.164f, 14.5f, 18.75f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Pause, contentDescription = null)
    }
}
