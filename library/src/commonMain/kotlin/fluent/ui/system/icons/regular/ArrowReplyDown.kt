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

public val FluentIcons.Regular.ArrowReplyDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReplyDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 10.53f, 17.53f, 14f, 13.25f, 14f)
            horizontalLineTo(5.561f)
            lineTo(9.28f, 17.72f)
            curveTo(9.573f, 18.013f, 9.573f, 18.487f, 9.28f, 18.78f)
            curveTo(8.987f, 19.073f, 8.513f, 19.073f, 8.22f, 18.78f)
            lineTo(3.22f, 13.78f)
            curveTo(2.927f, 13.487f, 2.927f, 13.013f, 3.22f, 12.72f)
            lineTo(8.22f, 7.72f)
            curveTo(8.513f, 7.427f, 8.987f, 7.427f, 9.28f, 7.72f)
            curveTo(9.573f, 8.013f, 9.573f, 8.487f, 9.28f, 8.78f)
            lineTo(5.561f, 12.5f)
            horizontalLineTo(13.25f)
            curveTo(16.702f, 12.5f, 19.5f, 9.702f, 19.5f, 6.25f)
            verticalLineTo(5.75f)
            curveTo(19.5f, 5.336f, 19.836f, 5f, 20.25f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowReplyDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowReplyDown, contentDescription = null)
    }
}
