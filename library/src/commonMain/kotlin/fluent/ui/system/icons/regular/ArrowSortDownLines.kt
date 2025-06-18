/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ArrowSortDownLines: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortDownLines",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 2.75f)
            curveTo(18f, 2.336f, 17.664f, 2f, 17.25f, 2f)
            curveTo(16.836f, 2f, 16.5f, 2.336f, 16.5f, 2.75f)
            verticalLineTo(19.439f)
            lineTo(14.28f, 17.22f)
            curveTo(13.987f, 16.927f, 13.513f, 16.927f, 13.22f, 17.22f)
            curveTo(12.927f, 17.513f, 12.927f, 17.987f, 13.22f, 18.28f)
            lineTo(16.72f, 21.78f)
            curveTo(17.013f, 22.073f, 17.487f, 22.073f, 17.78f, 21.78f)
            lineTo(21.28f, 18.28f)
            curveTo(21.573f, 17.987f, 21.573f, 17.513f, 21.28f, 17.22f)
            curveTo(20.987f, 16.927f, 20.513f, 16.927f, 20.22f, 17.22f)
            lineTo(18f, 19.439f)
            verticalLineTo(2.75f)
            close()
            moveTo(2.75f, 4.5f)
            curveTo(2.336f, 4.5f, 2f, 4.836f, 2f, 5.25f)
            curveTo(2f, 5.664f, 2.336f, 6f, 2.75f, 6f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 6f, 14f, 5.664f, 14f, 5.25f)
            curveTo(14f, 4.836f, 13.664f, 4.5f, 13.25f, 4.5f)
            horizontalLineTo(2.75f)
            close()
            moveTo(6f, 9.25f)
            curveTo(6f, 8.836f, 6.336f, 8.5f, 6.75f, 8.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 8.5f, 14f, 8.836f, 14f, 9.25f)
            curveTo(14f, 9.664f, 13.664f, 10f, 13.25f, 10f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 10f, 6f, 9.664f, 6f, 9.25f)
            close()
            moveTo(10.75f, 12.5f)
            curveTo(10.336f, 12.5f, 10f, 12.836f, 10f, 13.25f)
            curveTo(10f, 13.664f, 10.336f, 14f, 10.75f, 14f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 14f, 14f, 13.664f, 14f, 13.25f)
            curveTo(14f, 12.836f, 13.664f, 12.5f, 13.25f, 12.5f)
            horizontalLineTo(10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSortDownLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowSortDownLines, contentDescription = null)
    }
}
