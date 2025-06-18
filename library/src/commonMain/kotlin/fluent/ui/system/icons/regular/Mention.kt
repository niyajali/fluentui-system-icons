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

public val FluentUi.Regular.Mention: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mention",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            verticalLineTo(13.75f)
            curveTo(22f, 15.821f, 20.321f, 17.5f, 18.25f, 17.5f)
            curveTo(16.746f, 17.5f, 15.448f, 16.614f, 14.851f, 15.336f)
            curveTo(14.033f, 16.355f, 12.84f, 17f, 11.5f, 17f)
            curveTo(8.992f, 17f, 7f, 14.742f, 7f, 12f)
            curveTo(7f, 9.258f, 8.992f, 7f, 11.5f, 7f)
            curveTo(12.659f, 7f, 13.708f, 7.482f, 14.501f, 8.272f)
            lineTo(14.5f, 7.75f)
            curveTo(14.5f, 7.336f, 14.836f, 7f, 15.25f, 7f)
            curveTo(15.63f, 7f, 15.943f, 7.282f, 15.993f, 7.648f)
            lineTo(16f, 7.75f)
            verticalLineTo(13.75f)
            curveTo(16f, 14.993f, 17.007f, 16f, 18.25f, 16f)
            curveTo(19.441f, 16f, 20.416f, 15.075f, 20.495f, 13.904f)
            lineTo(20.5f, 13.75f)
            verticalLineTo(12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(13.033f, 20.5f, 14.04f, 20.316f, 14.985f, 19.961f)
            curveTo(15.373f, 19.816f, 15.805f, 20.012f, 15.951f, 20.4f)
            curveTo(16.096f, 20.788f, 15.9f, 21.22f, 15.512f, 21.366f)
            curveTo(14.399f, 21.783f, 13.214f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.429f, 2f, 21.848f, 6.327f, 21.996f, 11.72f)
            lineTo(22f, 12f)
            verticalLineTo(13.75f)
            verticalLineTo(12f)
            close()
            moveTo(11.5f, 8.5f)
            curveTo(9.865f, 8.5f, 8.5f, 10.048f, 8.5f, 12f)
            curveTo(8.5f, 13.952f, 9.865f, 15.5f, 11.5f, 15.5f)
            curveTo(13.134f, 15.5f, 14.5f, 13.952f, 14.5f, 12f)
            curveTo(14.5f, 10.048f, 13.134f, 8.5f, 11.5f, 8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MentionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Mention, contentDescription = null)
    }
}
