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

public val FluentIcons.Filled.LayoutColumnOneThirdRightHint: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.LayoutColumnOneThirdRightHint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                curveTo(4.5f, 6.664f, 4.164f, 7f, 3.75f, 7f)
                curveTo(3.336f, 7f, 3f, 6.664f, 3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                curveTo(6.664f, 3f, 7f, 3.336f, 7f, 3.75f)
                curveTo(7f, 4.164f, 6.664f, 4.5f, 6.25f, 4.5f)
                close()
                moveTo(9f, 3.75f)
                curveTo(9f, 3.336f, 9.336f, 3f, 9.75f, 3f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 3f, 13f, 3.336f, 13f, 3.75f)
                curveTo(13f, 4.164f, 12.664f, 4.5f, 12.25f, 4.5f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 4.5f, 9f, 4.164f, 9f, 3.75f)
                close()
                moveTo(3.75f, 9f)
                curveTo(4.164f, 9f, 4.5f, 9.336f, 4.5f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(4.5f, 14.664f, 4.164f, 15f, 3.75f, 15f)
                curveTo(3.336f, 15f, 3f, 14.664f, 3f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(3f, 9.336f, 3.336f, 9f, 3.75f, 9f)
                close()
                moveTo(3.75f, 17f)
                curveTo(4.164f, 17f, 4.5f, 17.336f, 4.5f, 17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                curveTo(6.664f, 19.5f, 7f, 19.836f, 7f, 20.25f)
                curveTo(7f, 20.664f, 6.664f, 21f, 6.25f, 21f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
                close()
                moveTo(9f, 20.25f)
                curveTo(9f, 19.836f, 9.336f, 19.5f, 9.75f, 19.5f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 19.5f, 13f, 19.836f, 13f, 20.25f)
                curveTo(13f, 20.664f, 12.664f, 21f, 12.25f, 21f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 21f, 9f, 20.664f, 9f, 20.25f)
                close()
                moveTo(14f, 3.75f)
                curveTo(14f, 3.336f, 14.336f, 3f, 14.75f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 21f, 14f, 20.664f, 14f, 20.25f)
                verticalLineTo(3.75f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun LayoutColumnOneThirdRightHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LayoutColumnOneThirdRightHint, contentDescription = null)
    }
}
