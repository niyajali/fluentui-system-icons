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

public val FluentUi.Filled.DataUsageEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataUsageEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 4.746f)
            curveTo(20f, 3.227f, 18.769f, 1.996f, 17.25f, 1.996f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 1.996f, 2f, 3.227f, 2f, 4.746f)
            verticalLineTo(17.246f)
            curveTo(2f, 18.765f, 3.231f, 19.996f, 4.75f, 19.996f)
            horizontalLineTo(11.416f)
            lineTo(11.521f, 19.576f)
            curveTo(11.683f, 18.928f, 12.018f, 18.337f, 12.49f, 17.864f)
            lineTo(14.649f, 15.706f)
            curveTo(14.555f, 15.584f, 14.5f, 15.433f, 14.5f, 15.27f)
            verticalLineTo(6.729f)
            curveTo(14.5f, 6.326f, 14.836f, 5.999f, 15.25f, 5.999f)
            curveTo(15.664f, 5.999f, 16f, 6.326f, 16f, 6.729f)
            verticalLineTo(14.354f)
            lineTo(18.393f, 11.962f)
            curveTo(18.851f, 11.503f, 19.411f, 11.209f, 20f, 11.078f)
            verticalLineTo(4.746f)
            close()
            moveTo(6f, 8.746f)
            curveTo(6f, 8.334f, 6.336f, 7.999f, 6.75f, 7.999f)
            curveTo(7.164f, 7.999f, 7.5f, 8.334f, 7.5f, 8.746f)
            verticalLineTo(15.253f)
            curveTo(7.5f, 15.665f, 7.164f, 15.999f, 6.75f, 15.999f)
            curveTo(6.336f, 15.999f, 6f, 15.665f, 6f, 15.253f)
            verticalLineTo(8.746f)
            close()
            moveTo(10.25f, 11.73f)
            curveTo(10.246f, 11.328f, 10.571f, 11f, 10.975f, 10.996f)
            curveTo(11.38f, 10.992f, 11.711f, 11.314f, 11.715f, 11.715f)
            lineTo(11.75f, 15.263f)
            curveTo(11.754f, 15.664f, 11.429f, 15.992f, 11.025f, 15.996f)
            curveTo(10.62f, 16f, 10.289f, 15.678f, 10.285f, 15.277f)
            lineTo(10.25f, 11.73f)
            close()
            moveTo(19.1f, 12.669f)
            lineTo(13.197f, 18.571f)
            curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
            lineTo(12.033f, 21.65f)
            curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
            lineTo(15.182f, 22.51f)
            curveTo(15.655f, 22.392f, 16.086f, 22.148f, 16.43f, 21.804f)
            lineTo(22.332f, 15.901f)
            curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.669f)
            curveTo(21.44f, 11.776f, 19.993f, 11.776f, 19.1f, 12.669f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataUsageEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataUsageEdit, contentDescription = null)
    }
}
