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

public val FluentUi.Regular.ClipboardTaskListLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClipboardTaskListLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.5f, 10.25f)
            curveTo(12.5f, 9.836f, 12.836f, 9.5f, 13.25f, 9.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 9.5f, 17.5f, 9.836f, 17.5f, 10.25f)
            curveTo(17.5f, 10.664f, 17.164f, 11f, 16.75f, 11f)
            horizontalLineTo(13.25f)
            curveTo(12.836f, 11f, 12.5f, 10.664f, 12.5f, 10.25f)
            close()
            moveTo(13.25f, 15f)
            curveTo(12.836f, 15f, 12.5f, 15.336f, 12.5f, 15.75f)
            curveTo(12.5f, 16.164f, 12.836f, 16.5f, 13.25f, 16.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 16.5f, 17.5f, 16.164f, 17.5f, 15.75f)
            curveTo(17.5f, 15.336f, 17.164f, 15f, 16.75f, 15f)
            horizontalLineTo(13.25f)
            close()
            moveTo(10.78f, 9.78f)
            curveTo(11.073f, 9.487f, 11.073f, 9.013f, 10.78f, 8.72f)
            curveTo(10.487f, 8.427f, 10.013f, 8.427f, 9.72f, 8.72f)
            lineTo(8.25f, 10.189f)
            lineTo(7.78f, 9.72f)
            curveTo(7.487f, 9.427f, 7.013f, 9.427f, 6.72f, 9.72f)
            curveTo(6.427f, 10.013f, 6.427f, 10.487f, 6.72f, 10.78f)
            lineTo(7.72f, 11.78f)
            curveTo(8.013f, 12.073f, 8.487f, 12.073f, 8.78f, 11.78f)
            lineTo(10.78f, 9.78f)
            close()
            moveTo(10.78f, 14.22f)
            curveTo(11.073f, 14.513f, 11.073f, 14.987f, 10.78f, 15.28f)
            lineTo(8.78f, 17.28f)
            curveTo(8.487f, 17.573f, 8.013f, 17.573f, 7.72f, 17.28f)
            lineTo(6.72f, 16.28f)
            curveTo(6.427f, 15.987f, 6.427f, 15.513f, 6.72f, 15.22f)
            curveTo(7.013f, 14.927f, 7.487f, 14.927f, 7.78f, 15.22f)
            lineTo(8.25f, 15.689f)
            lineTo(9.72f, 14.22f)
            curveTo(10.013f, 13.927f, 10.487f, 13.927f, 10.78f, 14.22f)
            close()
            moveTo(15.994f, 4.084f)
            curveTo(15.909f, 2.919f, 14.937f, 2f, 13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
            lineTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            lineTo(15.986f, 3.999f)
            curveTo(15.989f, 4.028f, 15.992f, 4.056f, 15.994f, 4.084f)
            close()
            moveTo(15.995f, 4.096f)
            lineTo(16f, 4.25f)
            curveTo(16f, 4.198f, 15.998f, 4.147f, 15.995f, 4.096f)
            close()
            moveTo(10.25f, 6.5f)
            horizontalLineTo(13.75f)
            curveTo(14.53f, 6.5f, 15.217f, 6.103f, 15.621f, 5.5f)
            lineTo(17.75f, 5.5f)
            curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(18.5f, 20.164f, 18.164f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
            lineTo(8.379f, 5.5f)
            curveTo(8.783f, 6.103f, 9.47f, 6.5f, 10.25f, 6.5f)
            close()
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardTaskListLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ClipboardTaskListLtr, contentDescription = null)
    }
}
