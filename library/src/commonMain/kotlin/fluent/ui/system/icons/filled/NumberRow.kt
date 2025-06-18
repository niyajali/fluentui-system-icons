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

public val FluentIcons.Filled.NumberRow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberRow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 4f)
            horizontalLineTo(8.75f)
            curveTo(10.269f, 4f, 11.5f, 5.231f, 11.5f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(11.5f, 18.769f, 10.269f, 20f, 8.75f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            close()
            moveTo(6f, 9f)
            verticalLineTo(15f)
            curveTo(6f, 15.414f, 6.336f, 15.75f, 6.75f, 15.75f)
            curveTo(7.164f, 15.75f, 7.5f, 15.414f, 7.5f, 15f)
            verticalLineTo(9f)
            curveTo(7.5f, 8.586f, 7.164f, 8.25f, 6.75f, 8.25f)
            curveTo(6.336f, 8.25f, 6f, 8.586f, 6f, 9f)
            close()
            moveTo(15.25f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
            horizontalLineTo(15.25f)
            curveTo(13.731f, 20f, 12.5f, 18.769f, 12.5f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(12.5f, 5.231f, 13.731f, 4f, 15.25f, 4f)
            close()
            moveTo(17.5f, 9.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(16.25f)
            curveTo(15.836f, 11.25f, 15.5f, 11.586f, 15.5f, 12f)
            verticalLineTo(15f)
            curveTo(15.5f, 15.414f, 15.836f, 15.75f, 16.25f, 15.75f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 15.75f, 19f, 15.414f, 19f, 15f)
            curveTo(19f, 14.586f, 18.664f, 14.25f, 18.25f, 14.25f)
            horizontalLineTo(17f)
            verticalLineTo(12.75f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 12.75f, 19f, 12.414f, 19f, 12f)
            verticalLineTo(9f)
            curveTo(19f, 8.586f, 18.664f, 8.25f, 18.25f, 8.25f)
            horizontalLineTo(16.25f)
            curveTo(15.836f, 8.25f, 15.5f, 8.586f, 15.5f, 9f)
            curveTo(15.5f, 9.414f, 15.836f, 9.75f, 16.25f, 9.75f)
            horizontalLineTo(17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NumberRow, contentDescription = null)
    }
}
