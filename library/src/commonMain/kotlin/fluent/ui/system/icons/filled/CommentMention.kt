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

public val FluentUi.Filled.CommentMention: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentMention",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 6.001f)
            curveTo(14f, 3.791f, 15.791f, 2f, 18f, 2f)
            curveTo(20.205f, 2f, 21.993f, 3.784f, 22.001f, 5.987f)
            lineTo(22f, 5.995f)
            verticalLineTo(6.751f)
            curveTo(22f, 7.165f, 21.665f, 7.501f, 21.25f, 7.501f)
            curveTo(20.836f, 7.501f, 20.5f, 7.165f, 20.5f, 6.751f)
            verticalLineTo(4.001f)
            curveTo(20.5f, 3.724f, 20.277f, 3.501f, 20f, 3.501f)
            curveTo(19.724f, 3.501f, 19.501f, 3.724f, 19.5f, 4f)
            curveTo(19.083f, 3.687f, 18.563f, 3.501f, 18f, 3.501f)
            curveTo(16.62f, 3.501f, 15.5f, 4.62f, 15.5f, 6.001f)
            curveTo(15.5f, 7.381f, 16.62f, 8.501f, 18f, 8.501f)
            curveTo(18.708f, 8.501f, 19.348f, 8.206f, 19.802f, 7.733f)
            curveTo(20.117f, 8.196f, 20.648f, 8.501f, 21.25f, 8.501f)
            curveTo(22.217f, 8.501f, 23f, 7.717f, 23f, 6.751f)
            verticalLineTo(6.01f)
            lineTo(23.001f, 6.001f)
            curveTo(23.001f, 3.239f, 20.762f, 1f, 18f, 1f)
            curveTo(15.238f, 1f, 13f, 3.239f, 13f, 6.001f)
            curveTo(13f, 8.762f, 15.238f, 11.001f, 18f, 11.001f)
            curveTo(19.025f, 11.001f, 19.98f, 10.701f, 20.778f, 10.166f)
            curveTo(21.008f, 10.012f, 21.069f, 9.702f, 20.915f, 9.472f)
            curveTo(20.762f, 9.243f, 20.451f, 9.181f, 20.222f, 9.335f)
            curveTo(19.588f, 9.76f, 18.826f, 10.001f, 18f, 10.001f)
            curveTo(15.791f, 10.001f, 14f, 8.21f, 14f, 6.001f)
            close()
            moveTo(18f, 7.501f)
            curveTo(17.172f, 7.501f, 16.5f, 6.829f, 16.5f, 6.001f)
            curveTo(16.5f, 5.172f, 17.172f, 4.501f, 18f, 4.501f)
            curveTo(18.829f, 4.501f, 19.5f, 5.172f, 19.5f, 6.001f)
            curveTo(19.5f, 6.829f, 18.829f, 7.501f, 18f, 7.501f)
            close()
            moveTo(5.25f, 3.001f)
            horizontalLineTo(12.803f)
            curveTo(12.292f, 3.883f, 12f, 4.908f, 12f, 6.001f)
            curveTo(12f, 9.314f, 14.686f, 12f, 18f, 12f)
            curveTo(19.537f, 12f, 20.938f, 11.423f, 22f, 10.473f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(13f)
            lineTo(8f, 21.75f)
            curveTo(7.176f, 22.369f, 6f, 21.781f, 6f, 20.75f)
            verticalLineTo(18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineTo(6.251f)
            curveTo(2f, 4.456f, 3.455f, 3.001f, 5.25f, 3.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentMentionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CommentMention, contentDescription = null)
    }
}
