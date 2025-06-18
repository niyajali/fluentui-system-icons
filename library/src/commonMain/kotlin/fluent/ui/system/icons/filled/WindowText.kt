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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.WindowText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(6.25f, 19.5f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(6.75f, 10.5f)
            curveTo(6.336f, 10.5f, 6f, 10.836f, 6f, 11.25f)
            curveTo(6f, 11.664f, 6.336f, 12f, 6.75f, 12f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 12f, 18f, 11.664f, 18f, 11.25f)
            curveTo(18f, 10.836f, 17.664f, 10.5f, 17.25f, 10.5f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6.75f, 13.25f)
            curveTo(6.336f, 13.25f, 6f, 13.586f, 6f, 14f)
            curveTo(6f, 14.414f, 6.336f, 14.75f, 6.75f, 14.75f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 14.75f, 13.5f, 14.414f, 13.5f, 14f)
            curveTo(13.5f, 13.586f, 13.164f, 13.25f, 12.75f, 13.25f)
            horizontalLineTo(6.75f)
            close()
            moveTo(15.75f, 13.25f)
            curveTo(15.336f, 13.25f, 15f, 13.586f, 15f, 14f)
            curveTo(15f, 14.414f, 15.336f, 14.75f, 15.75f, 14.75f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 14.75f, 18f, 14.414f, 18f, 14f)
            curveTo(18f, 13.586f, 17.664f, 13.25f, 17.25f, 13.25f)
            horizontalLineTo(15.75f)
            close()
            moveTo(6.75f, 16f)
            curveTo(6.336f, 16f, 6f, 16.336f, 6f, 16.75f)
            curveTo(6f, 17.164f, 6.336f, 17.5f, 6.75f, 17.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 17.5f, 9f, 17.164f, 9f, 16.75f)
            curveTo(9f, 16.336f, 8.664f, 16f, 8.25f, 16f)
            horizontalLineTo(6.75f)
            close()
            moveTo(11.25f, 16f)
            curveTo(10.836f, 16f, 10.5f, 16.336f, 10.5f, 16.75f)
            curveTo(10.5f, 17.164f, 10.836f, 17.5f, 11.25f, 17.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 17.5f, 18f, 17.164f, 18f, 16.75f)
            curveTo(18f, 16.336f, 17.664f, 16f, 17.25f, 16f)
            horizontalLineTo(11.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WindowTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WindowText, contentDescription = null)
    }
}
