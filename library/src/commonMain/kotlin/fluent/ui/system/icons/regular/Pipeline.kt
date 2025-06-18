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

public val FluentUi.Regular.Pipeline: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pipeline",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            curveTo(5.408f, 4f, 6.362f, 4.875f, 6.486f, 6f)
            lineTo(17.514f, 6f)
            curveTo(17.638f, 4.875f, 18.592f, 4f, 19.75f, 4f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 17.993f, 20.993f, 19f, 19.75f, 19f)
            curveTo(18.592f, 19f, 17.638f, 18.125f, 17.514f, 17f)
            lineTo(6.486f, 17f)
            curveTo(6.362f, 18.125f, 5.408f, 19f, 4.25f, 19f)
            curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(5f, 6.25f)
            curveTo(5f, 5.836f, 4.664f, 5.5f, 4.25f, 5.5f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(16.75f)
            curveTo(3.5f, 17.164f, 3.836f, 17.5f, 4.25f, 17.5f)
            curveTo(4.664f, 17.5f, 5f, 17.164f, 5f, 16.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.5f, 15.5f)
            lineTo(17.5f, 15.5f)
            verticalLineTo(7.5f)
            lineTo(6.5f, 7.5f)
            verticalLineTo(15.5f)
            close()
            moveTo(20.5f, 6.25f)
            curveTo(20.5f, 5.836f, 20.164f, 5.5f, 19.75f, 5.5f)
            curveTo(19.336f, 5.5f, 19f, 5.836f, 19f, 6.25f)
            verticalLineTo(16.75f)
            curveTo(19f, 17.164f, 19.336f, 17.5f, 19.75f, 17.5f)
            curveTo(20.164f, 17.5f, 20.5f, 17.164f, 20.5f, 16.75f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PipelinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Pipeline, contentDescription = null)
    }
}
