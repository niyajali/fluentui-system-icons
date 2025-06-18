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

public val FluentIcons.Regular.ArrowStepInDiagonalDownLeft: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.ArrowStepInDiagonalDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.78f, 4.28f)
                curveTo(20.073f, 3.987f, 20.073f, 3.513f, 19.78f, 3.22f)
                curveTo(19.487f, 2.927f, 19.013f, 2.927f, 18.72f, 3.22f)
                lineTo(10.5f, 11.439f)
                verticalLineTo(5.75f)
                curveTo(10.5f, 5.336f, 10.164f, 5f, 9.75f, 5f)
                curveTo(9.336f, 5f, 9f, 5.336f, 9f, 5.75f)
                verticalLineTo(13.25f)
                curveTo(9f, 13.664f, 9.336f, 14f, 9.75f, 14f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 14f, 18f, 13.664f, 18f, 13.25f)
                curveTo(18f, 12.836f, 17.664f, 12.5f, 17.25f, 12.5f)
                horizontalLineTo(11.561f)
                lineTo(19.78f, 4.28f)
                close()
                moveTo(6f, 21f)
                curveTo(7.657f, 21f, 9f, 19.657f, 9f, 18f)
                curveTo(9f, 16.343f, 7.657f, 15f, 6f, 15f)
                curveTo(4.343f, 15f, 3f, 16.343f, 3f, 18f)
                curveTo(3f, 19.657f, 4.343f, 21f, 6f, 21f)
                close()
                moveTo(6f, 19.5f)
                curveTo(5.172f, 19.5f, 4.5f, 18.828f, 4.5f, 18f)
                curveTo(4.5f, 17.172f, 5.172f, 16.5f, 6f, 16.5f)
                curveTo(6.828f, 16.5f, 7.5f, 17.172f, 7.5f, 18f)
                curveTo(7.5f, 18.828f, 6.828f, 19.5f, 6f, 19.5f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowStepInDiagonalDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowStepInDiagonalDownLeft, contentDescription = null)
    }
}
