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

public val FluentIcons.Regular.AppsAddIn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AppsAddIn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 3f)
            curveTo(11.743f, 3f, 12.75f, 4.007f, 12.75f, 5.25f)
            verticalLineTo(11.25f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 11.25f, 21f, 12.257f, 21f, 13.5f)
            verticalLineTo(18.75f)
            curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(10.5f)
            close()
            moveTo(11.25f, 12.75f)
            horizontalLineTo(4.5f)
            verticalLineTo(18.75f)
            curveTo(4.5f, 19.164f, 4.836f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(11.249f)
            lineTo(11.25f, 12.75f)
            close()
            moveTo(18.75f, 12.75f)
            horizontalLineTo(12.749f)
            verticalLineTo(19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 19.5f, 19.5f, 19.164f, 19.5f, 18.75f)
            verticalLineTo(13.5f)
            curveTo(19.5f, 13.086f, 19.164f, 12.75f, 18.75f, 12.75f)
            close()
            moveTo(10.5f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
            verticalLineTo(11.25f)
            horizontalLineTo(11.25f)
            verticalLineTo(5.25f)
            curveTo(11.25f, 4.836f, 10.914f, 4.5f, 10.5f, 4.5f)
            close()
            moveTo(17.898f, 2.007f)
            lineTo(18f, 2f)
            curveTo(18.38f, 2f, 18.694f, 2.282f, 18.743f, 2.648f)
            lineTo(18.75f, 2.75f)
            verticalLineTo(5.25f)
            horizontalLineTo(21.25f)
            curveTo(21.63f, 5.25f, 21.944f, 5.532f, 21.993f, 5.898f)
            lineTo(22f, 6f)
            curveTo(22f, 6.38f, 21.718f, 6.693f, 21.352f, 6.743f)
            lineTo(21.25f, 6.75f)
            horizontalLineTo(18.75f)
            verticalLineTo(9.25f)
            curveTo(18.75f, 9.63f, 18.468f, 9.943f, 18.102f, 9.993f)
            lineTo(18f, 10f)
            curveTo(17.62f, 10f, 17.306f, 9.718f, 17.257f, 9.352f)
            lineTo(17.25f, 9.25f)
            verticalLineTo(6.75f)
            horizontalLineTo(14.75f)
            curveTo(14.37f, 6.75f, 14.057f, 6.468f, 14.007f, 6.102f)
            lineTo(14f, 6f)
            curveTo(14f, 5.62f, 14.282f, 5.307f, 14.648f, 5.257f)
            lineTo(14.75f, 5.25f)
            horizontalLineTo(17.25f)
            verticalLineTo(2.75f)
            curveTo(17.25f, 2.37f, 17.532f, 2.057f, 17.898f, 2.007f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppsAddInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AppsAddIn, contentDescription = null)
    }
}
