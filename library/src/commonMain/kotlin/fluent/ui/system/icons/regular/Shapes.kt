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

public val FluentUi.Regular.Shapes: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Shapes",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 3.5f)
            curveTo(5.851f, 3.5f, 3.5f, 5.851f, 3.5f, 8.75f)
            curveTo(3.5f, 11.395f, 5.456f, 13.583f, 8f, 13.947f)
            verticalLineTo(15.459f)
            curveTo(4.625f, 15.086f, 2f, 12.224f, 2f, 8.75f)
            curveTo(2f, 5.022f, 5.022f, 2f, 8.75f, 2f)
            curveTo(12.224f, 2f, 15.086f, 4.625f, 15.459f, 8f)
            horizontalLineTo(13.947f)
            curveTo(13.583f, 5.456f, 11.395f, 3.5f, 8.75f, 3.5f)
            close()
            moveTo(12.25f, 9f)
            curveTo(10.455f, 9f, 9f, 10.455f, 9f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(9f, 20.545f, 10.455f, 22f, 12.25f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(22f, 10.455f, 20.545f, 9f, 18.75f, 9f)
            horizontalLineTo(12.25f)
            close()
            moveTo(10.5f, 12.25f)
            curveTo(10.5f, 11.283f, 11.283f, 10.5f, 12.25f, 10.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 10.5f, 20.5f, 11.283f, 20.5f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.716f, 19.716f, 20.5f, 18.75f, 20.5f)
            horizontalLineTo(12.25f)
            curveTo(11.283f, 20.5f, 10.5f, 19.716f, 10.5f, 18.75f)
            verticalLineTo(12.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShapesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Shapes, contentDescription = null)
    }
}
