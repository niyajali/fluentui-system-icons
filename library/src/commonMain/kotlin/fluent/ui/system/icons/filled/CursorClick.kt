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

public val FluentIcons.Filled.CursorClick: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorClick",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.25f, 2f)
            curveTo(9.664f, 2f, 10f, 2.336f, 10f, 2.75f)
            verticalLineTo(5.25f)
            curveTo(10f, 5.664f, 9.664f, 6f, 9.25f, 6f)
            curveTo(8.836f, 6f, 8.5f, 5.664f, 8.5f, 5.25f)
            verticalLineTo(2.75f)
            curveTo(8.5f, 2.336f, 8.836f, 2f, 9.25f, 2f)
            close()
            moveTo(4.47f, 3.97f)
            curveTo(4.763f, 3.677f, 5.237f, 3.677f, 5.53f, 3.97f)
            lineTo(7.28f, 5.72f)
            curveTo(7.573f, 6.013f, 7.573f, 6.487f, 7.28f, 6.78f)
            curveTo(6.987f, 7.073f, 6.513f, 7.073f, 6.22f, 6.78f)
            lineTo(4.47f, 5.03f)
            curveTo(4.177f, 4.738f, 4.177f, 4.263f, 4.47f, 3.97f)
            close()
            moveTo(14.03f, 3.97f)
            curveTo(14.323f, 4.263f, 14.323f, 4.738f, 14.03f, 5.03f)
            lineTo(12.28f, 6.78f)
            curveTo(11.987f, 7.073f, 11.513f, 7.073f, 11.22f, 6.78f)
            curveTo(10.927f, 6.488f, 10.927f, 6.013f, 11.22f, 5.72f)
            lineTo(12.97f, 3.97f)
            curveTo(13.263f, 3.677f, 13.737f, 3.677f, 14.03f, 3.97f)
            close()
            moveTo(2.5f, 8.75f)
            curveTo(2.5f, 8.336f, 2.836f, 8f, 3.25f, 8f)
            horizontalLineTo(5.75f)
            curveTo(6.164f, 8f, 6.5f, 8.336f, 6.5f, 8.75f)
            curveTo(6.5f, 9.164f, 6.164f, 9.5f, 5.75f, 9.5f)
            horizontalLineTo(3.25f)
            curveTo(2.836f, 9.5f, 2.5f, 9.164f, 2.5f, 8.75f)
            close()
            moveTo(8.5f, 9.487f)
            curveTo(8.5f, 8.36f, 9.822f, 7.752f, 10.677f, 8.486f)
            lineTo(19.138f, 15.738f)
            curveTo(20.048f, 16.518f, 19.53f, 18.009f, 18.333f, 18.057f)
            lineTo(14.493f, 18.211f)
            curveTo(14.08f, 18.227f, 13.692f, 18.41f, 13.417f, 18.718f)
            lineTo(10.802f, 21.64f)
            curveTo(9.995f, 22.543f, 8.5f, 21.972f, 8.5f, 20.761f)
            verticalLineTo(9.487f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CursorClickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CursorClick, contentDescription = null)
    }
}
