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

public val FluentIcons.Regular.SlideTextEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideTextEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 8f, 12f, 8.336f, 12f, 8.75f)
            curveTo(12f, 9.164f, 11.664f, 9.5f, 11.25f, 9.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
            close()
            moveTo(6.75f, 11f)
            curveTo(6.336f, 11f, 6f, 11.336f, 6f, 11.75f)
            curveTo(6f, 12.164f, 6.336f, 12.5f, 6.75f, 12.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 12.5f, 16f, 12.164f, 16f, 11.75f)
            curveTo(16f, 11.336f, 15.664f, 11f, 15.25f, 11f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6f, 14.75f)
            curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 14f, 14f, 14.336f, 14f, 14.75f)
            curveTo(14f, 15.164f, 13.664f, 15.5f, 13.25f, 15.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 15.5f, 6f, 15.164f, 6f, 14.75f)
            close()
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(11.26f)
            curveTo(21.523f, 11.058f, 21.008f, 10.974f, 20.5f, 11.007f)
            verticalLineTo(6.75f)
            curveTo(20.5f, 6.06f, 19.94f, 5.5f, 19.25f, 5.5f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 5.5f, 3.5f, 6.06f, 3.5f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(3.5f, 17.94f, 4.06f, 18.5f, 4.75f, 18.5f)
            horizontalLineTo(11.982f)
            curveTo(11.773f, 18.831f, 11.617f, 19.194f, 11.521f, 19.577f)
            lineTo(11.415f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(19.1f, 12.67f)
            lineTo(13.197f, 18.572f)
            curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
            lineTo(12.033f, 21.65f)
            curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
            lineTo(15.182f, 22.511f)
            curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
            lineTo(22.332f, 15.902f)
            curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
            curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideTextEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideTextEdit, contentDescription = null)
    }
}
