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

public val FluentUi.Filled.CloudWords: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudWords",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 5f)
            curveTo(9.02f, 5f, 6.548f, 7.172f, 6.08f, 10.019f)
            curveTo(3.792f, 10.231f, 2f, 12.156f, 2f, 14.5f)
            curveTo(2f, 16.985f, 4.015f, 19f, 6.5f, 19f)
            horizontalLineTo(17.5f)
            curveTo(19.985f, 19f, 22f, 16.985f, 22f, 14.5f)
            curveTo(22f, 12.156f, 20.208f, 10.231f, 17.92f, 10.019f)
            curveTo(17.452f, 7.172f, 14.98f, 5f, 12f, 5f)
            close()
            moveTo(10f, 9.5f)
            horizontalLineTo(14f)
            curveTo(14.414f, 9.5f, 14.75f, 9.836f, 14.75f, 10.25f)
            curveTo(14.75f, 10.664f, 14.414f, 11f, 14f, 11f)
            horizontalLineTo(10f)
            curveTo(9.586f, 11f, 9.25f, 10.664f, 9.25f, 10.25f)
            curveTo(9.25f, 9.836f, 9.586f, 9.5f, 10f, 9.5f)
            close()
            moveTo(5.5f, 14.25f)
            curveTo(5.5f, 13.836f, 5.836f, 13.5f, 6.25f, 13.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 13.5f, 11f, 13.836f, 11f, 14.25f)
            curveTo(11f, 14.664f, 10.664f, 15f, 10.25f, 15f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 15f, 5.5f, 14.664f, 5.5f, 14.25f)
            close()
            moveTo(13.75f, 13.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 13.5f, 18.5f, 13.836f, 18.5f, 14.25f)
            curveTo(18.5f, 14.664f, 18.164f, 15f, 17.75f, 15f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 15f, 13f, 14.664f, 13f, 14.25f)
            curveTo(13f, 13.836f, 13.336f, 13.5f, 13.75f, 13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudWordsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CloudWords, contentDescription = null)
    }
}
