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

public val FluentIcons.Filled.TextBulletListLtrRotate270: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextBulletListLtrRotate270",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.501f, 20.5f)
                curveTo(16.501f, 19.672f, 17.172f, 19.001f, 18f, 19.001f)
                curveTo(18.828f, 19.001f, 19.499f, 19.672f, 19.499f, 20.5f)
                curveTo(19.499f, 21.328f, 18.828f, 22f, 18f, 22f)
                curveTo(17.172f, 22f, 16.501f, 21.328f, 16.501f, 20.5f)
                close()
                moveTo(17f, 16.499f)
                verticalLineTo(2.996f)
                curveTo(17f, 2.444f, 17.448f, 1.996f, 18f, 1.996f)
                curveTo(18.513f, 1.996f, 18.935f, 2.382f, 18.993f, 2.879f)
                lineTo(19f, 2.996f)
                verticalLineTo(16.499f)
                curveTo(19f, 17.052f, 18.552f, 17.499f, 18f, 17.499f)
                curveTo(17.487f, 17.499f, 17.065f, 17.113f, 17.007f, 16.616f)
                lineTo(17f, 16.499f)
                close()
                moveTo(10.501f, 20.5f)
                curveTo(10.501f, 19.672f, 11.172f, 19.001f, 12f, 19.001f)
                curveTo(12.828f, 19.001f, 13.499f, 19.672f, 13.499f, 20.5f)
                curveTo(13.499f, 21.328f, 12.828f, 22f, 12f, 22f)
                curveTo(11.172f, 22f, 10.501f, 21.328f, 10.501f, 20.5f)
                close()
                moveTo(11f, 16.499f)
                verticalLineTo(2.996f)
                curveTo(11f, 2.444f, 11.448f, 1.996f, 12f, 1.996f)
                curveTo(12.513f, 1.996f, 12.936f, 2.382f, 12.993f, 2.879f)
                lineTo(13f, 2.996f)
                verticalLineTo(16.499f)
                curveTo(13f, 17.052f, 12.552f, 17.499f, 12f, 17.499f)
                curveTo(11.487f, 17.499f, 11.064f, 17.113f, 11.007f, 16.616f)
                lineTo(11f, 16.499f)
                close()
                moveTo(4.508f, 20.5f)
                curveTo(4.508f, 19.672f, 5.179f, 19.001f, 6.007f, 19.001f)
                curveTo(6.835f, 19.001f, 7.507f, 19.672f, 7.507f, 20.5f)
                curveTo(7.507f, 21.328f, 6.835f, 22f, 6.007f, 22f)
                curveTo(5.179f, 22f, 4.508f, 21.328f, 4.508f, 20.5f)
                close()
                moveTo(5.001f, 16.499f)
                lineTo(5.001f, 2.996f)
                curveTo(5.001f, 2.444f, 5.449f, 1.996f, 6.001f, 1.996f)
                curveTo(6.514f, 1.996f, 6.936f, 2.382f, 6.994f, 2.879f)
                lineTo(7.001f, 2.996f)
                lineTo(7.001f, 16.499f)
                curveTo(7.001f, 17.052f, 6.553f, 17.499f, 6.001f, 17.499f)
                curveTo(5.488f, 17.499f, 5.065f, 17.113f, 5.008f, 16.616f)
                lineTo(5.001f, 16.499f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextBulletListLtrRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletListLtrRotate270, contentDescription = null)
    }
}
