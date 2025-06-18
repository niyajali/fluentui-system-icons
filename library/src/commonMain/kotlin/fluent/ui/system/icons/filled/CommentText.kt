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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.CommentText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 3f, 22f, 4.455f, 22f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(13f)
            lineTo(8f, 21.75f)
            curveTo(7.176f, 22.368f, 6f, 21.78f, 6f, 20.75f)
            verticalLineTo(18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(11.25f, 12f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 12f, 19f, 11.664f, 19f, 11.25f)
            curveTo(19f, 10.836f, 18.664f, 10.5f, 18.25f, 10.5f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 10.5f, 10.5f, 10.836f, 10.5f, 11.25f)
            curveTo(10.5f, 11.664f, 10.836f, 12f, 11.25f, 12f)
            close()
            moveTo(8.25f, 10.5f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 10.5f, 5f, 10.836f, 5f, 11.25f)
            curveTo(5f, 11.664f, 5.336f, 12f, 5.75f, 12f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 12f, 9f, 11.664f, 9f, 11.25f)
            curveTo(9f, 10.836f, 8.664f, 10.5f, 8.25f, 10.5f)
            close()
            moveTo(5.75f, 13.5f)
            curveTo(5.336f, 13.5f, 5f, 13.836f, 5f, 14.25f)
            curveTo(5f, 14.664f, 5.336f, 15f, 5.75f, 15f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 15f, 13.5f, 14.664f, 13.5f, 14.25f)
            curveTo(13.5f, 13.836f, 13.164f, 13.5f, 12.75f, 13.5f)
            horizontalLineTo(5.75f)
            close()
            moveTo(15.75f, 15f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 15f, 19f, 14.664f, 19f, 14.25f)
            curveTo(19f, 13.836f, 18.664f, 13.5f, 18.25f, 13.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 13.5f, 15f, 13.836f, 15f, 14.25f)
            curveTo(15f, 14.664f, 15.336f, 15f, 15.75f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CommentText, contentDescription = null)
    }
}
