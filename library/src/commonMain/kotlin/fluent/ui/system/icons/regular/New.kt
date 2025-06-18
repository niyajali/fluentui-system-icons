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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.New: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.New",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.25f, 4f)
            curveTo(18.664f, 4f, 19f, 4.336f, 19f, 4.75f)
            verticalLineTo(13.25f)
            curveTo(19f, 13.664f, 18.664f, 14f, 18.25f, 14f)
            curveTo(17.836f, 14f, 17.5f, 13.664f, 17.5f, 13.25f)
            verticalLineTo(4.75f)
            curveTo(17.5f, 4.336f, 17.836f, 4f, 18.25f, 4f)
            close()
            moveTo(4f, 18.25f)
            curveTo(4f, 17.836f, 4.336f, 17.5f, 4.75f, 17.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 17.5f, 14f, 17.836f, 14f, 18.25f)
            curveTo(14f, 18.664f, 13.664f, 19f, 13.25f, 19f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 19f, 4f, 18.664f, 4f, 18.25f)
            close()
            moveTo(8.28f, 7.22f)
            curveTo(7.987f, 6.927f, 7.513f, 6.927f, 7.22f, 7.22f)
            curveTo(6.927f, 7.513f, 6.927f, 7.987f, 7.22f, 8.28f)
            lineTo(13.72f, 14.78f)
            curveTo(14.013f, 15.073f, 14.487f, 15.073f, 14.78f, 14.78f)
            curveTo(15.073f, 14.487f, 15.073f, 14.013f, 14.78f, 13.72f)
            lineTo(8.28f, 7.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.New, contentDescription = null)
    }
}
