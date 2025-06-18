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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ControlButton: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ControlButton",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.545f, 20.545f, 20f, 18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(7.75f, 8f)
            curveTo(6.231f, 8f, 5f, 9.231f, 5f, 10.75f)
            verticalLineTo(13.25f)
            curveTo(5f, 14.769f, 6.231f, 16f, 7.75f, 16f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 16f, 9f, 15.664f, 9f, 15.25f)
            curveTo(9f, 14.836f, 8.664f, 14.5f, 8.25f, 14.5f)
            horizontalLineTo(7.75f)
            curveTo(7.06f, 14.5f, 6.5f, 13.94f, 6.5f, 13.25f)
            verticalLineTo(10.75f)
            curveTo(6.5f, 10.06f, 7.06f, 9.5f, 7.75f, 9.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 9.5f, 9f, 9.164f, 9f, 8.75f)
            curveTo(9f, 8.336f, 8.664f, 8f, 8.25f, 8f)
            horizontalLineTo(7.75f)
            close()
            moveTo(11.5f, 8.75f)
            curveTo(11.5f, 8.336f, 11.164f, 8f, 10.75f, 8f)
            curveTo(10.336f, 8f, 10f, 8.336f, 10f, 8.75f)
            verticalLineTo(11f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 11f, 9f, 11.336f, 9f, 11.75f)
            curveTo(9f, 12.164f, 9.336f, 12.5f, 9.75f, 12.5f)
            horizontalLineTo(10f)
            verticalLineTo(14f)
            curveTo(10f, 15.105f, 10.895f, 16f, 12f, 16f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 16f, 13f, 15.664f, 13f, 15.25f)
            curveTo(13f, 14.836f, 12.664f, 14.5f, 12.25f, 14.5f)
            horizontalLineTo(12f)
            curveTo(11.724f, 14.5f, 11.5f, 14.276f, 11.5f, 14f)
            verticalLineTo(12.5f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 12.5f, 13f, 12.164f, 13f, 11.75f)
            curveTo(13f, 11.336f, 12.664f, 11f, 12.25f, 11f)
            horizontalLineTo(11.5f)
            verticalLineTo(8.75f)
            close()
            moveTo(19.5f, 8.75f)
            curveTo(19.5f, 8.336f, 19.164f, 8f, 18.75f, 8f)
            curveTo(18.336f, 8f, 18f, 8.336f, 18f, 8.75f)
            verticalLineTo(15.25f)
            curveTo(18f, 15.664f, 18.336f, 16f, 18.75f, 16f)
            curveTo(19.164f, 16f, 19.5f, 15.664f, 19.5f, 15.25f)
            verticalLineTo(8.75f)
            close()
            moveTo(15.5f, 13f)
            curveTo(15.5f, 12.724f, 15.724f, 12.5f, 16f, 12.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 12.5f, 17f, 12.164f, 17f, 11.75f)
            curveTo(17f, 11.336f, 16.664f, 11f, 16.25f, 11f)
            horizontalLineTo(16f)
            curveTo(14.895f, 11f, 14f, 11.895f, 14f, 13f)
            verticalLineTo(15.25f)
            curveTo(14f, 15.664f, 14.336f, 16f, 14.75f, 16f)
            curveTo(15.164f, 16f, 15.5f, 15.664f, 15.5f, 15.25f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ControlButtonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ControlButton, contentDescription = null)
    }
}
