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

public val FluentUi.Filled.LockShield: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockShield",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 7f, 20f, 8.455f, 20f, 10.25f)
            verticalLineTo(12.519f)
            curveTo(19.437f, 12.183f, 18.981f, 11.778f, 18.69f, 11.487f)
            curveTo(18.04f, 10.838f, 16.95f, 10.838f, 16.3f, 11.487f)
            curveTo(15.77f, 12.017f, 14.69f, 12.926f, 13.42f, 13.106f)
            curveTo(13.358f, 13.115f, 13.295f, 13.128f, 13.233f, 13.145f)
            curveTo(12.962f, 12.755f, 12.511f, 12.5f, 12f, 12.5f)
            curveTo(11.172f, 12.5f, 10.5f, 13.172f, 10.5f, 14f)
            curveTo(10.5f, 14.828f, 11.172f, 15.5f, 12f, 15.5f)
            verticalLineTo(17.524f)
            curveTo(12f, 18.802f, 12.352f, 19.979f, 13.033f, 21f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 21f, 4f, 19.545f, 4f, 17.75f)
            verticalLineTo(10.25f)
            curveTo(4f, 8.455f, 5.455f, 7f, 7.25f, 7f)
            horizontalLineTo(8f)
            verticalLineTo(6f)
            curveTo(8f, 3.791f, 9.791f, 2f, 12f, 2f)
            curveTo(14.209f, 2f, 16f, 3.791f, 16f, 6f)
            close()
            moveTo(9.5f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(14.5f)
            verticalLineTo(6f)
            curveTo(14.5f, 4.619f, 13.381f, 3.5f, 12f, 3.5f)
            curveTo(10.619f, 3.5f, 9.5f, 4.619f, 9.5f, 6f)
            close()
            moveTo(17.99f, 12.194f)
            curveTo(18.642f, 12.845f, 19.896f, 13.88f, 21.439f, 14.093f)
            curveTo(21.747f, 14.135f, 22f, 14.378f, 22f, 14.682f)
            verticalLineTo(17.52f)
            curveTo(22f, 21.336f, 18.421f, 22.721f, 17.647f, 22.976f)
            curveTo(17.55f, 23.008f, 17.451f, 23.008f, 17.354f, 22.976f)
            curveTo(16.58f, 22.721f, 13f, 21.336f, 13f, 17.52f)
            lineTo(13f, 14.682f)
            curveTo(13f, 14.378f, 13.253f, 14.135f, 13.561f, 14.093f)
            curveTo(15.103f, 13.88f, 16.358f, 12.845f, 17.01f, 12.194f)
            curveTo(17.27f, 11.935f, 17.729f, 11.935f, 17.99f, 12.194f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LockShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LockShield, contentDescription = null)
    }
}
