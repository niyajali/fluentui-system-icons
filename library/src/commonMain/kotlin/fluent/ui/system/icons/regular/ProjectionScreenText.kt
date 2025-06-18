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

public val FluentUi.Regular.ProjectionScreenText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ProjectionScreenText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 7.75f)
            curveTo(9f, 7.336f, 9.336f, 7f, 9.75f, 7f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 7f, 14.5f, 7.336f, 14.5f, 7.75f)
            curveTo(14.5f, 8.164f, 14.164f, 8.5f, 13.75f, 8.5f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 8.5f, 9f, 8.164f, 9f, 7.75f)
            close()
            moveTo(9.75f, 13f)
            curveTo(9.336f, 13f, 9f, 13.336f, 9f, 13.75f)
            curveTo(9f, 14.164f, 9.336f, 14.5f, 9.75f, 14.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 14.5f, 14.5f, 14.164f, 14.5f, 13.75f)
            curveTo(14.5f, 13.336f, 14.164f, 13f, 13.75f, 13f)
            horizontalLineTo(9.75f)
            close()
            moveTo(8.75f, 10f)
            curveTo(8.336f, 10f, 8f, 10.336f, 8f, 10.75f)
            curveTo(8f, 11.164f, 8.336f, 11.5f, 8.75f, 11.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 11.5f, 16f, 11.164f, 16f, 10.75f)
            curveTo(16f, 10.336f, 15.664f, 10f, 15.25f, 10f)
            horizontalLineTo(8.75f)
            close()
            moveTo(2f, 4.5f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 3f, 22f, 3.672f, 22f, 4.5f)
            curveTo(22f, 5.153f, 21.583f, 5.709f, 21f, 5.915f)
            verticalLineTo(13.25f)
            curveTo(21f, 15.321f, 19.321f, 17f, 17.25f, 17f)
            horizontalLineTo(12.75f)
            verticalLineTo(19.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 19.5f, 17f, 19.836f, 17f, 20.25f)
            curveTo(17f, 20.664f, 16.664f, 21f, 16.25f, 21f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 21f, 7f, 20.664f, 7f, 20.25f)
            curveTo(7f, 19.836f, 7.336f, 19.5f, 7.75f, 19.5f)
            horizontalLineTo(11.25f)
            verticalLineTo(17f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 17f, 3f, 15.321f, 3f, 13.25f)
            verticalLineTo(5.915f)
            curveTo(2.417f, 5.709f, 2f, 5.153f, 2f, 4.5f)
            close()
            moveTo(19.5f, 6f)
            horizontalLineTo(4.5f)
            verticalLineTo(13.25f)
            curveTo(4.5f, 14.493f, 5.507f, 15.5f, 6.75f, 15.5f)
            horizontalLineTo(17.25f)
            curveTo(18.493f, 15.5f, 19.5f, 14.493f, 19.5f, 13.25f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ProjectionScreenTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ProjectionScreenText, contentDescription = null)
    }
}
