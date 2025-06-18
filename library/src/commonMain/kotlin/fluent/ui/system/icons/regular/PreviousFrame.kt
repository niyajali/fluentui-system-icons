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

public val FluentIcons.Regular.PreviousFrame: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PreviousFrame",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.5f, 3.75f)
            curveTo(18.5f, 3.336f, 18.836f, 3f, 19.25f, 3f)
            curveTo(19.665f, 3f, 20f, 3.336f, 20f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(20f, 20.664f, 19.665f, 21f, 19.25f, 21f)
            curveTo(18.836f, 21f, 18.5f, 20.664f, 18.5f, 20.25f)
            verticalLineTo(3.75f)
            close()
            moveTo(12.261f, 3.309f)
            curveTo(13.423f, 2.514f, 15f, 3.345f, 15f, 4.753f)
            verticalLineTo(19.248f)
            curveTo(15f, 20.661f, 13.412f, 21.492f, 12.251f, 20.685f)
            lineTo(1.753f, 13.383f)
            curveTo(0.747f, 12.684f, 0.753f, 11.195f, 1.763f, 10.503f)
            lineTo(12.261f, 3.309f)
            close()
            moveTo(13.5f, 4.753f)
            curveTo(13.5f, 4.552f, 13.275f, 4.433f, 13.109f, 4.547f)
            lineTo(2.611f, 11.74f)
            curveTo(2.466f, 11.839f, 2.466f, 12.052f, 2.609f, 12.152f)
            lineTo(13.108f, 19.453f)
            curveTo(13.273f, 19.569f, 13.5f, 19.45f, 13.5f, 19.248f)
            verticalLineTo(4.753f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PreviousFramePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PreviousFrame, contentDescription = null)
    }
}
