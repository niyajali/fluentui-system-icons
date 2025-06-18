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

public val FluentUi.Regular.ArrowUpLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.246f, 3f)
            curveTo(13.66f, 3f, 13.996f, 3.336f, 13.996f, 3.75f)
            curveTo(13.996f, 4.164f, 13.66f, 4.5f, 13.246f, 4.5f)
            horizontalLineTo(5.577f)
            lineTo(20.777f, 19.7f)
            curveTo(21.075f, 19.998f, 21.075f, 20.482f, 20.777f, 20.781f)
            curveTo(20.478f, 21.08f, 19.994f, 21.08f, 19.695f, 20.781f)
            lineTo(4.496f, 5.582f)
            verticalLineTo(13.25f)
            curveTo(4.496f, 13.664f, 4.16f, 14f, 3.746f, 14f)
            curveTo(3.332f, 14f, 2.996f, 13.664f, 2.996f, 13.25f)
            verticalLineTo(3.75f)
            curveTo(2.996f, 3.336f, 3.332f, 3f, 3.746f, 3f)
            horizontalLineTo(13.246f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowUpLeft, contentDescription = null)
    }
}
