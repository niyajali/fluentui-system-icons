/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.BriefcaseOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BriefcaseOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.135f, 6.196f)
            curveTo(3.889f, 6.651f, 3f, 7.847f, 3f, 9.25f)
            verticalLineTo(10.75f)
            curveTo(3f, 11.717f, 3.783f, 12.5f, 4.75f, 12.5f)
            horizontalLineTo(10f)
            verticalLineTo(12f)
            curveTo(10f, 11.739f, 10.1f, 11.502f, 10.263f, 11.324f)
            lineTo(13.676f, 14.737f)
            curveTo(13.498f, 14.9f, 13.261f, 15f, 13f, 15f)
            horizontalLineTo(11f)
            curveTo(10.448f, 15f, 10f, 14.552f, 10f, 14f)
            horizontalLineTo(4.75f)
            curveTo(4.106f, 14f, 3.505f, 13.813f, 3f, 13.489f)
            verticalLineTo(16.75f)
            curveTo(3f, 18.545f, 4.455f, 20f, 6.25f, 20f)
            horizontalLineTo(17.75f)
            curveTo(18.108f, 20f, 18.452f, 19.942f, 18.774f, 19.835f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(5.135f, 6.196f)
            close()
            moveTo(17.182f, 14f)
            lineTo(20.864f, 17.683f)
            curveTo(20.953f, 17.387f, 21f, 17.074f, 21f, 16.75f)
            verticalLineTo(13.489f)
            curveTo(20.495f, 13.813f, 19.894f, 14f, 19.25f, 14f)
            horizontalLineTo(17.182f)
            close()
            moveTo(8f, 4.818f)
            lineTo(15.682f, 12.5f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 12.5f, 21f, 11.717f, 21f, 10.75f)
            verticalLineTo(9.25f)
            curveTo(21f, 7.455f, 19.545f, 6f, 17.75f, 6f)
            horizontalLineTo(16f)
            verticalLineTo(4.25f)
            curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
            verticalLineTo(4.818f)
            close()
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(9.5f)
            verticalLineTo(4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BriefcaseOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BriefcaseOff, contentDescription = null)
    }
}
