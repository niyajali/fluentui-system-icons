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

public val FluentUi.Filled.Mention: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mention",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.429f, 2f, 21.848f, 6.327f, 21.996f, 11.72f)
            lineTo(22f, 12f)
            lineTo(22f, 13.525f)
            curveTo(21.986f, 15.723f, 20.201f, 17.5f, 18f, 17.5f)
            curveTo(16.554f, 17.5f, 15.288f, 16.733f, 14.585f, 15.584f)
            curveTo(13.785f, 16.418f, 12.703f, 16.933f, 11.5f, 16.933f)
            curveTo(8.985f, 16.933f, 7f, 14.684f, 7f, 11.967f)
            curveTo(7f, 9.25f, 8.985f, 7f, 11.5f, 7f)
            curveTo(12.437f, 7f, 13.3f, 7.312f, 14.014f, 7.844f)
            curveTo(14.087f, 7.366f, 14.501f, 7f, 15f, 7f)
            curveTo(15.513f, 7f, 15.936f, 7.386f, 15.993f, 7.883f)
            lineTo(16f, 8f)
            verticalLineTo(13.5f)
            curveTo(16f, 14.605f, 16.895f, 15.5f, 18f, 15.5f)
            curveTo(19.054f, 15.5f, 19.918f, 14.684f, 19.994f, 13.649f)
            lineTo(20f, 13.475f)
            lineTo(20f, 12f)
            curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
            curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
            curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
            curveTo(12.922f, 20f, 13.82f, 19.845f, 14.67f, 19.544f)
            curveTo(15.19f, 19.36f, 15.762f, 19.633f, 15.946f, 20.153f)
            curveTo(16.13f, 20.674f, 15.857f, 21.245f, 15.337f, 21.43f)
            curveTo(14.274f, 21.806f, 13.149f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(11.649f, 9.005f)
            lineTo(11.5f, 9f)
            curveTo(10.149f, 9f, 9f, 10.302f, 9f, 11.967f)
            curveTo(9f, 13.631f, 10.149f, 14.933f, 11.5f, 14.933f)
            curveTo(12.801f, 14.933f, 13.915f, 13.726f, 13.995f, 12.15f)
            lineTo(14f, 11.929f)
            curveTo(13.983f, 10.344f, 12.925f, 9.096f, 11.649f, 9.005f)
            lineTo(11.5f, 9f)
            lineTo(11.649f, 9.005f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MentionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Mention, contentDescription = null)
    }
}
