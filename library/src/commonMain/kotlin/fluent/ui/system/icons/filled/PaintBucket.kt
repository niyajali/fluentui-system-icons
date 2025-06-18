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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.PaintBucket: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBucket",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2.25f)
            curveTo(12f, 1.836f, 11.664f, 1.5f, 11.25f, 1.5f)
            curveTo(10.836f, 1.5f, 10.5f, 1.836f, 10.5f, 2.25f)
            verticalLineTo(3.499f)
            curveTo(10.193f, 3.608f, 9.905f, 3.785f, 9.659f, 4.03f)
            lineTo(2.78f, 10.909f)
            curveTo(1.902f, 11.788f, 1.902f, 13.212f, 2.78f, 14.091f)
            lineTo(7.659f, 18.97f)
            curveTo(8.538f, 19.848f, 9.962f, 19.848f, 10.841f, 18.97f)
            lineTo(17.72f, 12.091f)
            curveTo(18.598f, 11.212f, 18.598f, 9.788f, 17.72f, 8.909f)
            lineTo(12.841f, 4.03f)
            curveTo(12.595f, 3.785f, 12.307f, 3.608f, 12f, 3.499f)
            verticalLineTo(2.25f)
            close()
            moveTo(10.5f, 5.311f)
            verticalLineTo(6.75f)
            curveTo(10.5f, 7.164f, 10.836f, 7.5f, 11.25f, 7.5f)
            curveTo(11.664f, 7.5f, 12f, 7.164f, 12f, 6.75f)
            verticalLineTo(5.311f)
            lineTo(16.659f, 9.97f)
            curveTo(16.952f, 10.263f, 16.952f, 10.738f, 16.659f, 11.03f)
            lineTo(15.689f, 12f)
            horizontalLineTo(3.812f)
            curveTo(3.822f, 11.99f, 3.831f, 11.98f, 3.841f, 11.97f)
            lineTo(10.5f, 5.311f)
            close()
            moveTo(19.521f, 13.602f)
            curveTo(19.192f, 12.985f, 18.308f, 12.985f, 17.979f, 13.602f)
            lineTo(15.971f, 17.368f)
            curveTo(14.852f, 19.466f, 16.372f, 22f, 18.75f, 22f)
            curveTo(21.128f, 22f, 22.649f, 19.466f, 21.529f, 17.368f)
            lineTo(19.521f, 13.602f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaintBucketPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PaintBucket, contentDescription = null)
    }
}
