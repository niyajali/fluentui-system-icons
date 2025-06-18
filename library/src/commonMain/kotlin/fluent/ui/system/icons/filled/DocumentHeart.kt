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

public val FluentUi.Filled.DocumentHeart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentHeart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.896f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(9.49f)
            lineTo(12.66f, 18.829f)
            curveTo(14.405f, 17.085f, 14.405f, 14.257f, 12.66f, 12.512f)
            curveTo(11.125f, 10.977f, 8.751f, 10.793f, 7.015f, 11.96f)
            curveTo(6.113f, 11.354f, 5.039f, 11.112f, 4f, 11.235f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.896f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(7.015f, 22.75f)
            curveTo(6.823f, 22.75f, 6.631f, 22.677f, 6.484f, 22.53f)
            lineTo(2.076f, 18.122f)
            curveTo(0.722f, 16.768f, 0.722f, 14.573f, 2.076f, 13.219f)
            curveTo(3.43f, 11.866f, 5.625f, 11.866f, 6.979f, 13.219f)
            lineTo(7.015f, 13.255f)
            lineTo(7.051f, 13.219f)
            curveTo(8.404f, 11.866f, 10.599f, 11.866f, 11.953f, 13.219f)
            curveTo(13.307f, 14.573f, 13.307f, 16.768f, 11.953f, 18.122f)
            lineTo(7.545f, 22.53f)
            curveTo(7.399f, 22.677f, 7.207f, 22.75f, 7.015f, 22.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentHeart, contentDescription = null)
    }
}
