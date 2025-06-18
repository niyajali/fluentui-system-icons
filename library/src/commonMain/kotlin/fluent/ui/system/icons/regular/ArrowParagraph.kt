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

public val FluentIcons.Regular.ArrowParagraph: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowParagraph",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 2f)
            curveTo(21.664f, 2f, 22f, 2.336f, 22f, 2.75f)
            verticalLineTo(6.75f)
            curveTo(22f, 8.269f, 20.769f, 9.5f, 19.25f, 9.5f)
            horizontalLineTo(13.561f)
            lineTo(16.28f, 12.22f)
            curveTo(16.573f, 12.513f, 16.573f, 12.987f, 16.28f, 13.28f)
            curveTo(15.987f, 13.573f, 15.513f, 13.573f, 15.22f, 13.28f)
            lineTo(11.22f, 9.28f)
            curveTo(10.927f, 8.987f, 10.927f, 8.513f, 11.22f, 8.22f)
            lineTo(15.22f, 4.22f)
            curveTo(15.513f, 3.927f, 15.987f, 3.927f, 16.28f, 4.22f)
            curveTo(16.573f, 4.513f, 16.573f, 4.987f, 16.28f, 5.28f)
            lineTo(13.561f, 8f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 8f, 20.5f, 7.44f, 20.5f, 6.75f)
            verticalLineTo(2.75f)
            curveTo(20.5f, 2.336f, 20.836f, 2f, 21.25f, 2f)
            close()
            moveTo(7.72f, 11.22f)
            curveTo(7.427f, 11.513f, 7.427f, 11.987f, 7.72f, 12.28f)
            lineTo(10.439f, 15f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
            curveTo(2f, 16.164f, 2.336f, 16.5f, 2.75f, 16.5f)
            horizontalLineTo(10.439f)
            lineTo(7.72f, 19.22f)
            curveTo(7.427f, 19.513f, 7.427f, 19.987f, 7.72f, 20.28f)
            curveTo(8.013f, 20.573f, 8.487f, 20.573f, 8.78f, 20.28f)
            lineTo(12.78f, 16.28f)
            curveTo(13.073f, 15.987f, 13.073f, 15.513f, 12.78f, 15.22f)
            lineTo(8.78f, 11.22f)
            curveTo(8.487f, 10.927f, 8.013f, 10.927f, 7.72f, 11.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowParagraphPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowParagraph, contentDescription = null)
    }
}
