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

public val FluentIcons.Regular.CardUi: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CardUi",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 7.25f)
            curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(20.5f, 17.716f, 19.716f, 18.5f, 18.75f, 18.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(5f, 7.75f)
            curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 7f, 12f, 7.336f, 12f, 7.75f)
            curveTo(12f, 8.164f, 11.664f, 8.5f, 11.25f, 8.5f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 8.5f, 5f, 8.164f, 5f, 7.75f)
            close()
            moveTo(6f, 13f)
            curveTo(5.448f, 13f, 5f, 13.448f, 5f, 14f)
            verticalLineTo(16f)
            curveTo(5f, 16.552f, 5.448f, 17f, 6f, 17f)
            horizontalLineTo(13f)
            curveTo(13.552f, 17f, 14f, 16.552f, 14f, 16f)
            verticalLineTo(14f)
            curveTo(14f, 13.448f, 13.552f, 13f, 13f, 13f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 10.25f)
            curveTo(5f, 9.836f, 5.336f, 9.5f, 5.75f, 9.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 9.5f, 17f, 9.836f, 17f, 10.25f)
            curveTo(17f, 10.664f, 16.664f, 11f, 16.25f, 11f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 11f, 5f, 10.664f, 5f, 10.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CardUiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CardUi, contentDescription = null)
    }
}
