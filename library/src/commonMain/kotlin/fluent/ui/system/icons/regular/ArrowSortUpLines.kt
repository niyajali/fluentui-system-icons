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

public val FluentIcons.Regular.ArrowSortUpLines: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortUpLines",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 21.25f)
            curveTo(18f, 21.664f, 17.664f, 22f, 17.25f, 22f)
            curveTo(16.836f, 22f, 16.5f, 21.664f, 16.5f, 21.25f)
            verticalLineTo(4.561f)
            lineTo(14.28f, 6.78f)
            curveTo(13.987f, 7.073f, 13.513f, 7.073f, 13.22f, 6.78f)
            curveTo(12.927f, 6.487f, 12.927f, 6.013f, 13.22f, 5.72f)
            lineTo(16.72f, 2.22f)
            curveTo(17.013f, 1.927f, 17.487f, 1.927f, 17.78f, 2.22f)
            lineTo(21.28f, 5.72f)
            curveTo(21.573f, 6.013f, 21.573f, 6.487f, 21.28f, 6.78f)
            curveTo(20.987f, 7.073f, 20.513f, 7.073f, 20.22f, 6.78f)
            lineTo(18f, 4.561f)
            verticalLineTo(21.25f)
            close()
            moveTo(2.75f, 19.5f)
            curveTo(2.336f, 19.5f, 2f, 19.164f, 2f, 18.75f)
            curveTo(2f, 18.336f, 2.336f, 18f, 2.75f, 18f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 18f, 14f, 18.336f, 14f, 18.75f)
            curveTo(14f, 19.164f, 13.664f, 19.5f, 13.25f, 19.5f)
            horizontalLineTo(2.75f)
            close()
            moveTo(6f, 14.75f)
            curveTo(6f, 15.164f, 6.336f, 15.5f, 6.75f, 15.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 15.5f, 14f, 15.164f, 14f, 14.75f)
            curveTo(14f, 14.336f, 13.664f, 14f, 13.25f, 14f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            close()
            moveTo(10.75f, 11.5f)
            curveTo(10.336f, 11.5f, 10f, 11.164f, 10f, 10.75f)
            curveTo(10f, 10.336f, 10.336f, 10f, 10.75f, 10f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 10f, 14f, 10.336f, 14f, 10.75f)
            curveTo(14f, 11.164f, 13.664f, 11.5f, 13.25f, 11.5f)
            horizontalLineTo(10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSortUpLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowSortUpLines, contentDescription = null)
    }
}
